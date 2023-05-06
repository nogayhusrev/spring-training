package com.nogayhusrev.service.impl;

import com.nogayhusrev.dto.StudentDTO;
import com.nogayhusrev.repository.StudentRepository;
import com.nogayhusrev.service.StudentService;
import com.nogayhusrev.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final MapperUtil mapperUtil;

    public StudentServiceImpl(StudentRepository studentRepository, MapperUtil mapperUtil) {
        this.studentRepository = studentRepository;
        this.mapperUtil = mapperUtil;
    }

    public List<StudentDTO> getStudents() {
        return studentRepository.findAll().stream().map(student -> mapperUtil.convert(student, new StudentDTO())).collect(Collectors.toList());
    }

}
