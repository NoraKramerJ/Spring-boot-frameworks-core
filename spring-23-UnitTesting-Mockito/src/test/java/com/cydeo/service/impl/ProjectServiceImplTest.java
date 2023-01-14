package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class})
class ProjectServiceImplTest {

@Mock
    ProjectMapper projectMapper;
@Mock
ProjectRepository projectRepository;

@InjectMocks
ProjectServiceImpl projectService;



@Test
    void getByProjectCode_Test(){
//this part is given when we are ready to do the test
    when(projectRepository.findByProjectCode(anyString())).thenReturn(new Project());
    // stubbing (defining the behavior and the return result)
    when(projectMapper.convertToDto(any(Project.class))).thenReturn(new ProjectDTO());
    // this part when the real action happens
    ProjectDTO projectDTO=projectService.getByProjectCode(anyString());
// this part is going to be the then
    InOrder inOrder= inOrder(projectRepository,projectMapper); // I want to check the order of these 2 mocks
    inOrder.verify(projectRepository).findByProjectCode(anyString()); // we are providing in which order these 2 mocks should be
    inOrder.verify(projectMapper).convertToDto(any(Project.class));

    assertNotNull(projectDTO);
}


    @Test
    void getByProjectCode_ExceptionTest() {

        when(projectRepository.findByProjectCode("")).thenThrow(new NoSuchElementException("Project Not Found"));

        Throwable throwable = assertThrows(NoSuchElementException.class, () -> projectService.getByProjectCode(""));

        verify(projectRepository).findByProjectCode(""); // we need to verify the empty string first

        verify(projectMapper, never()).convertToDto(any(Project.class)); // because we are expecting an exception, this method should never run

        assertEquals("Project Not Found", throwable.getMessage());

    }

}


/*
public ProjectDTO getByProjectCode(String code) { // ""
        // Any other exception thrown in here
        Project project = projectRepository.findByProjectCode(code);    // projectRepository.findByProjectCode("")
        return projectMapper.convertToDto(project);
    }

 */