package com.onlinecourse.userservice.dao.daoimpl;

import com.onlinecourse.userservice.configuration.UserMapper;
import com.onlinecourse.userservice.dao.EducationDao;
import com.onlinecourse.userservice.dto.EducationDto;
import com.onlinecourse.userservice.exception.customexception.EducationNotFoundException;
import com.onlinecourse.userservice.model.Education;
import com.onlinecourse.userservice.model.User;
import com.onlinecourse.userservice.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EducationDaoImpl implements EducationDao {

    private final EducationRepository educationRepository;

    private final UserMapper mapper;

    @Override
    public EducationDto addEducation(EducationDto educationDto, User user){
        Education educationData = mapper.educationDtoToEducation(educationDto);
        educationData.setUser(user);
        educationRepository.save(educationData);
        return mapper.educationToEducationDto(educationData);
    }

    @Override
    public Education searchEducation(Long educationId){
        return educationRepository.findByEducationId(educationId).orElseThrow(() -> new EducationNotFoundException("Education Not Found"));
    }

    @Override
    public EducationDto updateEducation(EducationDto educationDto,Education education){
        Education educationData = mapper.updateEducationToEducation(educationDto,education);
        educationRepository.save(educationData);
        return mapper.educationToEducationDto(educationData);
    }

}
