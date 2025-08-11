package com.onlinecourse.userservice.controller;

import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void registerUser(@RequestBody User data){
        userService.save(data);
    }

}
