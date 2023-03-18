package com.anurag.rating.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_ratings")
public class Rating {
    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private Integer rating;
    private String feedback;

    public Rating() {
    }

    public Rating(String ratingId, String userId, String hotelId, Integer rating, String feedback) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.feedback = feedback;
    }

    public String getRatingId() {
        return ratingId;
    }

    public Rating setRatingId(String ratingId) {
        this.ratingId = ratingId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Rating setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getHotelId() {
        return hotelId;
    }

    public Rating setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    public Integer getRating() {
        return rating;
    }

    public Rating setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public String getFeedback() {
        return feedback;
    }

    public Rating setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
}
