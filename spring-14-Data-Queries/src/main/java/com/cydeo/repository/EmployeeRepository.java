package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    List<Employee> findByEmailNotNull(String email);

    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();


    @Query("SELECT e.salary FROM Employee e WHERE e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary();


    //NotEqual
    @Query( "Select e from Employee e where e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    //Like/ Contains/ Startswiths/ Endswith
    @Query("Select e from Employee e where e.firstName Like ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //less Than
    @Query("Select e from Employee e where e.salary < ?1")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);

    //Greater than and to  get employee name first name for that salary

    @Query("Select e.firstName from Employee e where e.salary > ?1")
    List<String> retrieveEmployeeSalaryGreaterThan(int salary);

    //between
    @Query("Select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int a,int b);

    //before
    @Query("Select e from Employee e where e.hireDate > ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate date);

    //Null
    @Query("select e from Employee e where e.email IS NULL")
    List<Employee> retrieveEmployeeEmailIsNull();

    //Not Null
    @Query("select e from Employee e where e.email IS NOT NULL")
    List<Employee> retrieveEmployeeEmailIsNotNull();


    //Sorting in Asc order
    @Query("select e from Employee e order by e.salary" )

    List<Employee>retrieveEmployeeSalaryOrderAsc();

     //Sorting in Desc order
   @Query("select e from Employee e order by e.salary desc " )

      List<Employee>retrieveEmployeeSalaryOrderDesc();


   //how to write Native query, in native queries, we use tables
    @Query(value=" select * from employees where salary=?1 ",nativeQuery=true)

    List<Employee> retrieveEmployeeDetailBySalary(int salary);

    //Named Parameter
    @Query("select e from Employee e where e.salary=:salary")

    List<Employee> retrieveEmployeeSalary(@Param("salary")int salary);


}

