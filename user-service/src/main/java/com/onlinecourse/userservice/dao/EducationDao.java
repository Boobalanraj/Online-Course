package com.onlinecourse.userservice.dao;

import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.model.Education;
import com.onlinecourse.userservice.model.User;

public interface EducationDao {

    EducationDto addEducation(EducationDto educationDto, User user);

    Education searchEducation(Long educationId);

    EducationDto updateEducation(EducationDto educationDto,Education education);

}
