package dev.yatin.movies.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.yatin.movies.Service.reviewser;
import dev.yatin.movies.model.review;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api/v1/reviews")
public class reviewcontroller {
  @Autowired
  private reviewser re;
  
  @PostMapping
  public ResponseEntity<review> createReview(@RequestBody Map<String,String> payload){
      return new ResponseEntity<review>(re.createReview(payload.get("revbody"),payload.get("imdbId")),HttpStatus.OK);
  }
}
