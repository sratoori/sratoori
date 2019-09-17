package com.sr.ratingdataservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.ratingdataservice.model.UserRating;

public interface UserRatingDAO extends JpaRepository<UserRating, String>{

}
