package com.anurag.user.service.exceptions;

import com.anurag.user.service.payload.ApiResponse;
import com.anurag.user.service.payload.builder.ApiResponseBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){

        String message = ex.getMessage();

        ApiResponse response = new ApiResponseBuilder().setMessage(message).setSuccess(true).setStatus(HttpStatus.NOT_FOUND).getApiResponse();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }
}
