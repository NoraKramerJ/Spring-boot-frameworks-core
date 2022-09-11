package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);
        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherBoard = container.getBean(Motherboard.class);
        PC myPc = new PC(theCase,theMonitor,theMotherBoard);

        myPc.powerUp();


    }
}
// how to add dependencies in them Pom.xml file Right clicks inside the pom.xml code,
// select Generate -> Add maven dependency -> Search for "Spring Core" and add the first one.
//Or you can copy and paste the one I sent above.
/*
There is a class called Class in java.
It is holding information about an object, which class it is belong to.
If you use .class, it is returning the Class object with your object's class information.

Basically you can imagine something like this.
new Class("ComputerConfig class")
 */