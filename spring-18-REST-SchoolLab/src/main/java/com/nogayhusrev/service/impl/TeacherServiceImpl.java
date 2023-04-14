package com.nogayhusrev.service.impl;

import com.nogayhusrev.dto.TeacherDTO;
import com.nogayhusrev.entity.Teacher;
import com.nogayhusrev.repository.TeacherRepository;
import com.nogayhusrev.service.TeacherService;
import com.nogayhusrev.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final MapperUtil mapperUtil;

    public TeacherServiceImpl(TeacherRepository teacherRepository, MapperUtil mapperUtil) {
        this.teacherRepository = teacherRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll()
                .stream()
                .map(teacher -> mapperUtil.convert(teacher, new TeacherDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public TeacherDTO findById(Long id) throws Exception {
        Teacher foundTeacher = teacherRepository.findById(id)
                .orElseThrow(() -> new Exception("No Teacher Found!"));
        return mapperUtil.convert(foundTeacher, new TeacherDTO());
    }

}