package com.sr.ratingdataservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.ratingdataservice.model.Rating;

public interface RatingDAO extends JpaRepository<Rating, String>{

}
