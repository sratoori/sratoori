package com.sr.moviecatalogservice.model;

import java.util.ArrayList;
import java.util.List;

public class UserRating {
	
	private String userId;
    
    private List<Rating> ratings = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

	public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}