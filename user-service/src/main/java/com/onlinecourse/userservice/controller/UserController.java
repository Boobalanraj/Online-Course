package com.onlinecourse.userservice.controller;

import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
import com.onlinecourse.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void registerUser(@RequestBody RegisterDto data){
        userService.save(data);
    }

    @PostMapping("/{userId}/education")
    public EducationDto addEducation(@RequestBody EducationDto educationDto,@PathVariable Long userId){
        return userService.addEducation(educationDto,userId);
    }

    @GetMapping("/userList")
    public List<ResponseProfileDto> getAllUserData(){
        return userService.getAllUserData();
    }

    @PutMapping("/{userId}/education/{educationId}")
    public EducationDto updateEducation(@RequestBody EducationDto educationDto,@PathVariable Long userId,@PathVariable Long educationId){
        return userService.updateEducation(educationDto,userId,educationId);
    }

}
