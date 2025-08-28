package com.onlinecourse.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String fullName;

    private String roleLooking;

    private String industry;

    private boolean workingRemotely;

    private boolean willingToRelocateIntoYourCountry;

}
