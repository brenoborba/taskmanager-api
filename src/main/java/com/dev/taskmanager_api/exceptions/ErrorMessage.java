package com.dev.taskmanager_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.ZonedDateTime;

public class ErrorMessage {
    private final String message;
    private final int statusCode;
    private final ZonedDateTime timestamp;


    public ErrorMessage(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
        this.timestamp = ZonedDateTime.now();
    }

    public ErrorMessage(String message, int statusCode, ZonedDateTime timestamp) {
        this.message = message;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
    }

    public static ResponseEntity<ErrorMessage> createResponse(String message, HttpStatus httpStatus) {
        ErrorMessage errorMessage = new ErrorMessage(message, httpStatus.value());
        return new ResponseEntity<>(errorMessage, httpStatus);
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
