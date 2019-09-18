package com.sr.ratingdataservice.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class UserRating {

    @Id
	private String userId;
    private String name;
    @OneToMany
    private List<Rating> ratings = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

	/*
	 * public void initData(String userId) { this.setUserId(userId);
	 * this.setRatings(Arrays.asList( new Rating("100", 3), new Rating("200", 4) ));
	 * }
	 */
}