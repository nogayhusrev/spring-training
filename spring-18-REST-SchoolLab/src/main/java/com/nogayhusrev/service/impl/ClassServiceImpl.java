package com.nogayhusrev.service.impl;

import com.nogayhusrev.dto.ClassDTO;
import com.nogayhusrev.entity.Class;
import com.nogayhusrev.repository.ClassRepository;
import com.nogayhusrev.service.ClassService;
import com.nogayhusrev.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassServiceImpl implements ClassService {

    private final ClassRepository classRepository;
    private final MapperUtil mapperUtil;

    public ClassServiceImpl(ClassRepository classRepository, MapperUtil mapperUtil) {
        this.classRepository = classRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<ClassDTO> findAll() {
        return classRepository.findAll()
                .stream()
                .map(theClass -> mapperUtil.convert(theClass, new ClassDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public ClassDTO findById(Long id) throws Exception {
        Class foundClass = classRepository.findById(id)
                .orElseThrow(() -> new Exception("No Class Found!"));
        return mapperUtil.convert(foundClass, new ClassDTO());
    }

}