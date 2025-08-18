package com.onlinecourse.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String fullName;

    private String password;

    private String roleLooking;

    private String industry;

    private boolean workingRemotely;

    private boolean willingToRelocateIntoYourCountry;

    @OneToMany(mappedBy = "userId")
    private List<WorkExperience> workExperiences;

    @OneToMany(mappedBy = "userId")
    private List<Education> educations;
}
