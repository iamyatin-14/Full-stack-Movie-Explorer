package dev.yatin.movies.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import dev.yatin.movies.Repository.Reviewrepo;
import dev.yatin.movies.model.movie;
import dev.yatin.movies.model.review;

@Service
public class reviewser {
    @Autowired
    private Reviewrepo reviewrepo;
    @Autowired
    private MongoTemplate mongoTemplate;
    public review createReview(String revbody,String imdbId){

      review r=reviewrepo.insert(new review(revbody));
      mongoTemplate.update(movie.class)
              .matching(Criteria.where("imdbId").is(imdbId))
              .apply(new Update().push("reviewIds").value(r))
              .first();
      return r;
    }
}
