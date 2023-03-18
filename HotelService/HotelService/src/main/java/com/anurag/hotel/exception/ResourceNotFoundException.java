package com.anurag.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){
        super("Resource is not found");
    }
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
