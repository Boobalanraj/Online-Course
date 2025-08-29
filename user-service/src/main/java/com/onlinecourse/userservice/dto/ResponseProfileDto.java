package com.onlinecourse.userservice.dto;

import com.onlinecourse.userservice.model.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseProfileDto {

    private String fullName;

    private String roleLooking;

    private String industry;

    private boolean workingRemotely;

    private boolean willingToRelocateIntoYourCountry;

    private List<WorkExperience> workExperiences;

    private List<EducationDto> educations;
}
