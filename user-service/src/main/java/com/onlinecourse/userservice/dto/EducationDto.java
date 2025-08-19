package com.onlinecourse.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EducationDto {

    private Long educationId;

    private String institutionName;

    private String degree;

    private String major;

    private Double gradeOrPercentage;

}
