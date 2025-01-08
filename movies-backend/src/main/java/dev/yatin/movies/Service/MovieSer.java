package dev.yatin.movies.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.yatin.movies.Repository.Movierepo;
import dev.yatin.movies.model.movie;

@Service
public class MovieSer {
  @Autowired
  private Movierepo movierepo;   
  public List<movie> allmovies(){
    System.out.println(movierepo.findAll().toString());
    return movierepo.findAll();
  }
  public Optional<movie> singmovie(String imdbId){
    return movierepo.findByimdbId(imdbId);
  }
}
