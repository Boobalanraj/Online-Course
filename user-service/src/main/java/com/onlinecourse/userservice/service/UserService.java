package com.onlinecourse.userservice.service;

import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.dto.RegisterDto;
import com.onlinecourse.userservice.dto.ResponseProfileDto;
import com.onlinecourse.userservice.dto.UserDto;


import java.util.List;

public interface UserService {

    void save(RegisterDto data);

    EducationDto addEducation(EducationDto educationDto,Long userId);

    List<ResponseProfileDto> getAllUserData();

    EducationDto updateEducation(EducationDto educationDto, Long userId, Long educationId);

    ResponseProfileDto getUserData(Long userId);

    ResponseProfileDto updateUserData(Long userId, UserDto userDto);
}
