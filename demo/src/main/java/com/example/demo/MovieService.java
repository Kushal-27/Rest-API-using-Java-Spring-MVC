package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	public List<Movie> allMovies(){
		return movieRepository.findAll();
	}

	public Optional<Movie> singleMovie(Integer id) {
		return movieRepository.findById(id);
	}
	public Movie addMovie(Integer id, String name, Integer rating) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setName(name);
        movie.setRating(rating);
        return movieRepository.save(movie);
    }
}
