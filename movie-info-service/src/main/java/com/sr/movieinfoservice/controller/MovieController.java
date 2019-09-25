package com.sr.movieinfoservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.movieinfoservice.dao.MovieInfoDAO;
import com.sr.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieInfoDAO movieInfoDAO;
	
	@RequestMapping("/{movieId}")
	public Optional<Movie> getMovieInfo(@PathVariable("movieId") String movieId) {
		return movieInfoDAO.findById(movieId);
	}
}
