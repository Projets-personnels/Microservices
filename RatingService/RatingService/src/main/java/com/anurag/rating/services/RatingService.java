package com.anurag.rating.services;

import com.anurag.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get All Ratings
    List<Rating> getRating();

    //get all by userId
    List<Rating> getRatingByUserId(String userId);

    //    get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
