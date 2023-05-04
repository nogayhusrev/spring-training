package com.nogayhusrev.service.impl;

import com.nogayhusrev.mapper.UserMapper;
import com.nogayhusrev.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;      // Mock object instead of UserRepository object

    @Mock
    UserMapper userMapper;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    void findByUserName_Test() {

        // I'm calling the real method inside the main, which is the method I want to test.
        userService.findByUserName("harold@manager.com");

        // I'm checking if this method ran or not.
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);


        verify(userRepository, times(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atMost(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        InOrder inOrder = inOrder(userRepository, userMapper);

        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);
        inOrder.verify(userMapper).convertToDto(null);


        inOrder.verify(userMapper).convertToDto(null);
        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);


    }

}