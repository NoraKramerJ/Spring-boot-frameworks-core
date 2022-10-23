package com.cydeo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="students")

public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="studentFirstName")
    private String firstName;
    @Column(name="studentLastName")
    private String lastName;
    private String email;


    @Column(columnDefinition = "Date")
    private LocalDate birthDate;
    @Column(columnDefinition = "Time")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;







}
