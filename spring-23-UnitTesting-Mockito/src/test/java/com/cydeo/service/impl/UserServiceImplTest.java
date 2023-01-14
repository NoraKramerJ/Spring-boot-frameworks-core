package com.cydeo.service.impl;

import com.cydeo.mapper.UserMapper;
import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository; // this is a mock object
    @Mock
    UserMapper userMapper; // this is a mock object

    @InjectMocks // used to inject mocks into the UserServiceImpl
    UserServiceImpl userService;


    @Test
    void findByUserName_Test(){
        // calling the real method inside the main, which is the method I want to test
       userService.findByUserName("nora@cydeo.com");
        //I am checking if this method ran or not.
       verify(userRepository).findByUserNameAndIsDeleted("nora@cydeo.com", false);
 verify(userRepository, times(1)).findByUserNameAndIsDeleted("nora@cydeo.com", false);
 verify(userRepository,atLeastOnce()).findByUserNameAndIsDeleted("nora@cydeo.com", false);
 verify(userRepository,atLeast(1)).findByUserNameAndIsDeleted("nora@cydeo.com", false);
 verify(userRepository,atMostOnce()).findByUserNameAndIsDeleted("nora@cydeo.com",false);
 verify(userRepository, atMost(1)).findByUserNameAndIsDeleted("nora@cydeo.com",false);

        InOrder inOrder=inOrder(userRepository, userMapper); // to check the order of implementation
        inOrder.verify(userRepository).findByUserNameAndIsDeleted("nora@cydeo.com",false);
        inOrder.verify(userMapper).convertToDto(null);


    }

}