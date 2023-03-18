package com.anurag.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    ResourceNotFoundException(){
        super("Resource not found on server");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
