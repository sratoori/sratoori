package com.sr.ratingdataservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.ratingdataservice.dao.RatingDAO;
import com.sr.ratingdataservice.dao.UserRatingDAO;
import com.sr.ratingdataservice.model.Rating;
import com.sr.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {
	
	@Autowired
	RatingDAO ratingDAO;
	@Autowired
	UserRatingDAO userRatingDAO;
	
	@RequestMapping("/movie/{movieId}")
	public Optional<Rating> getMovieRating(@PathVariable("movieId") String movieId) {
		return ratingDAO.findById(movieId);
	}
	
	@RequestMapping("/user/{userId}")
	public Optional<UserRating> getUserRating(@PathVariable("userId") String userId) {
		return userRatingDAO.findById(userId);
	}
}