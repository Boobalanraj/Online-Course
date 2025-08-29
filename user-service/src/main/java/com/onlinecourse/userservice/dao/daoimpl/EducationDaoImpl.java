package com.onlinecourse.userservice.dao.daoimpl;

import com.onlinecourse.userservice.configuration.UserMapper;
import com.onlinecourse.userservice.dao.EducationDao;
import com.onlinecourse.userservice.exception.customexception.EducationNotFoundException;
import com.onlinecourse.userservice.model.Education;
import com.onlinecourse.userservice.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EducationDaoImpl implements EducationDao {

    private final EducationRepository educationRepository;

    private final UserMapper mapper;

    @Override
    public Education saveEducation(Education educationData){
        return educationRepository.save(educationData);
    }

    @Override
    public Education searchEducation(Long educationId){
        return educationRepository.findByEducationId(educationId).orElseThrow(() -> new EducationNotFoundException("Education Not Found"));
    }
}
