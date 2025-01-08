package dev.yatin.movies.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.yatin.movies.Service.MovieSer;
import dev.yatin.movies.model.movie;
@CrossOrigin(origins = "*")


@RestController
@RequestMapping("/api/v1/movies")
public class moviecontroller {
  @Autowired
  private MovieSer movieSer;
  @GetMapping
  public ResponseEntity<List<movie>> getallmovies(){
    return new ResponseEntity<List<movie>>(movieSer.allmovies(),HttpStatus.OK);
  }
  @GetMapping("/{imdbId}")
  public ResponseEntity<Optional<movie>> get1movies(@PathVariable String imdbId){
    return new ResponseEntity<Optional<movie>>(movieSer.singmovie(imdbId),HttpStatus.OK);
  }

}
