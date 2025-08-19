package com.onlinecourse.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkExperienceDto {

    private String companyName;

    private String roleOrJobTitle;

    private String description;

}
