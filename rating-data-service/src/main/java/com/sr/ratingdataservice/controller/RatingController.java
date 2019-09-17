package com.sr.ratingdataservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.ratingdataservice.model.Rating;
import com.sr.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
	
	@RequestMapping("/movie/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId) {
		return new Rating (movieId, 4);
	}
	
	@RequestMapping("/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		return null;
	}
}