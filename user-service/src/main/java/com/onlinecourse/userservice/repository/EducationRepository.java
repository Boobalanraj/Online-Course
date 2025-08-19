package com.onlinecourse.userservice.repository;

import com.onlinecourse.userservice.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {

    Optional<Education> findByEducationId(Long educationId);

}
