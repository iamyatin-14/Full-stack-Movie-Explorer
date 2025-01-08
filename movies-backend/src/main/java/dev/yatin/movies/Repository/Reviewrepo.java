package dev.yatin.movies.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.yatin.movies.model.review;

@Repository
public interface Reviewrepo extends MongoRepository<review,ObjectId> {

}
