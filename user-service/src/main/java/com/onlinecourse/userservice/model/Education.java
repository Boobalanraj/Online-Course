package com.onlinecourse.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "education_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationId;

    private String institutionName;

    private String degree;

    private String major;

    private double gradeOrPercentage;

    @ManyToOne
    @JoinColumn(name="userId",referencedColumnName = "userId")
    private User userId;
}
