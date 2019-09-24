package com.sr.movieinfoservice.model;

import javax.persistence.Entity;

@Entity
public class Movie {
	private String movieId;
	private String name;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
