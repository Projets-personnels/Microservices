package com.anurag.hotel.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;

    public Hotel() {
    }

    public Hotel(String hotelId, String name, String location, String about) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.about = about;
    }

    public String getHotelId() {
        return hotelId;
    }

    public Hotel setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Hotel setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Hotel setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getAbout() {
        return about;
    }

    public Hotel setAbout(String about) {
        this.about = about;
        return this;
    }
}
