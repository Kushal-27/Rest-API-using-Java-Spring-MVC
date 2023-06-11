package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@RestController
@RequestMapping("/api")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(),HttpStatus.OK);
    }
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable Integer id){
		System.out.println(id);
		return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Movie> addMovie(@RequestBody Movie payload){
        Movie movie = movieService.addMovie(payload.getId(), payload.getName(), payload.getRating());
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
	}
	
}
