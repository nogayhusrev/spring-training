package com.nogayhusrev.service.impl;

import com.nogayhusrev.dto.UserDTO;
import com.nogayhusrev.entity.User;
import com.nogayhusrev.repository.UserRepository;
import com.nogayhusrev.service.UserService;
import com.nogayhusrev.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(user -> mapperUtil.convert(user, new UserDTO())).collect(Collectors.toList());
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        return mapperUtil.convert(userRepository.save(mapperUtil.convert(userDTO, new User())), new UserDTO());
    }

}
