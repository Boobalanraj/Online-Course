package com.onlinecourse.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "work_experience")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workExperienceId;

    private String companyName;

    private String roleOrJobTitle;

    private String description;

    @ManyToOne
    @JoinColumn(name="userId",referencedColumnName = "userId")
    private User user;

}
