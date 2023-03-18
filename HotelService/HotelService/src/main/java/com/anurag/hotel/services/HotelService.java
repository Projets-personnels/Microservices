package com.anurag.hotel.services;

import com.anurag.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel create(Hotel hotel);

    //Get all
    List<Hotel> getAll();

    // Get Single Hotel
    Hotel getHotel(String id);
}
