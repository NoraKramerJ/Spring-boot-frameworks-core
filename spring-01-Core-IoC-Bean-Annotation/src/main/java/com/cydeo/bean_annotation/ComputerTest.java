package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {
        ApplicationContext container= new AnnotationConfigApplicationContext();



    }
}
// how to add dependencies in them Pom.xml file Right clicks inside the pom.xml code,
// select Generate -> Add maven dependency -> Search for "Spring Core" and add the first one.
//Or you can copy and paste the one I sent above.