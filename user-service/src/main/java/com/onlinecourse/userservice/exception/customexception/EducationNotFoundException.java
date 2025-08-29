package com.onlinecourse.userservice.exception.customexception;

public class EducationNotFoundException extends RuntimeException {
    public EducationNotFoundException(String message) {
        super(message);
    }
}
