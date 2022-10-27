package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //display all employees with email address ""

    List<Employee> findByEmail(String email);


    //display all employees with firstname "" and last name "",
    //also show all employee with an email address ""

    List<Employee> findEmployeeByFirstNameAndAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees that firstname is not ""

    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with " "
    List<Employee> findByLastNameStartingWith(String lastName);

    //display all employees with salaries higher than ""
List<Employee> findBySalaryGreaterThan(Integer salary);

    //display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer salary);


    //display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);


    // display all employees where salaries greater and equal to "" in order-salary

    List<Employee> findBySalaryGreaterThanEqualOOrderBySalary(Integer salary);

    //display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

}
