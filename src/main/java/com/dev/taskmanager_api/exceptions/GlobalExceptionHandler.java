package com.dev.taskmanager_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException e) {
        return ErrorMessage.createResponse(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ErrorMessage> conflictException(ConflictException e) {
        return ErrorMessage.createResponse(e.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception e) {
        ErrorMessage message = new ErrorMessage(
                e.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR.value()
        );

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    @ExceptionHandler(ApiRequestException.class)
//    public ResponseEntity<Object> handleNotFoundException(ApiException e) {
//        ApiException apiException = new ApiException(
//                e.getMessage(),
//                HttpStatus.NOT_FOUND,
//                ZonedDateTime.now(ZoneId.of("Z"))
//        );
//
//        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
//    }
}
