package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department {

    @Id
    private String department;

    // here department's name in the table is actually the department id
    private String division;

}
