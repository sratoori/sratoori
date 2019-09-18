package com.sr.ratingdataservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rating {
	@Id
	private String movieId;
    private int rating;
    public UserRating userRating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

	@ManyToOne
	@JoinColumn(name = "userId")
    public UserRating getUserRating() {
		return userRating;
	}

	public void setUserRating(UserRating userRating) {
		this.userRating = userRating;
	}
}