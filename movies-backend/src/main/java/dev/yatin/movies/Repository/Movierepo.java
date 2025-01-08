package dev.yatin.movies.Repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.yatin.movies.model.movie;
@Repository
public interface Movierepo extends MongoRepository<movie,ObjectId> {
    Optional<movie> findByimdbId(String imdbId);
}
