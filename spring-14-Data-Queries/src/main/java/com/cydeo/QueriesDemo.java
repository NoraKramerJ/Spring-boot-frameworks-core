package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;

public class QueriesDemo implements CommandLineRunner {


    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueriesDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void run(String... args) throws Exception {


        System.out.println("findByCountry"+ regionRepository.findByCountry("Canada"));
        System.out.println("findByCountryContaining: "+regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByRegion"+regionRepository.findByCountryContainingOrderByRegion("United"));
        System.out.println("findTop2ByCountry"+ regionRepository.findTop2ByCountry("United States"));
        System.out.println("findByCountryContainingOrderByRegion"+regionRepository.findByCountryContainingOrderByRegion("United States"));


        System.out.println("departments");
        System.out.println(departmentRepository.findByDepartment("Furniture"));
        System.out.println(departmentRepository.findByDivision("Health"));
        System.out.println(departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println(departmentRepository.findDistinctTop3ByDivisionContains("Health"));
    }
}
