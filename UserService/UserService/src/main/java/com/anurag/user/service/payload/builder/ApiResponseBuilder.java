package com.anurag.user.service.payload.builder;

import com.anurag.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;

public class ApiResponseBuilder {

    private String message;
    private boolean success;
    private HttpStatus status;

    public ApiResponseBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public ApiResponseBuilder setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public ApiResponseBuilder setStatus(HttpStatus status) {
        this.status = status;
        return this;
    }

    public ApiResponse getApiResponse(){
        return new ApiResponse(message,success,status);
    }
}
