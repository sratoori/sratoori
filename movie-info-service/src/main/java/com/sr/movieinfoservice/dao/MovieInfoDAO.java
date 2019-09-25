package com.sr.movieinfoservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.movieinfoservice.model.Movie;

public interface MovieInfoDAO extends JpaRepository<Movie, String>{

}
