package com.onlinecourse.userservice.dao;

import com.onlinecourse.userservice.model.Education;

public interface EducationDao {

    Education saveEducation(Education educationData);

    Education searchEducation(Long educationId);

}
