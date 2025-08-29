package com.onlinecourse.userservice.exception;

import com.onlinecourse.userservice.exception.customexception.EducationNotFoundException;
import com.onlinecourse.userservice.exception.customexception.UserNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserNotFoundException.class)
    public String UserNotFoundHandler(){
        return "User Not Found";
    }

    @ExceptionHandler(EducationNotFoundException.class)
    public String EducationNotFoundHandler(){
        return "Education Not Found";
    }


}
