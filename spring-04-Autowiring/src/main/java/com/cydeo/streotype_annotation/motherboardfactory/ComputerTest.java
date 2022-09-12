package com.cydeo.streotype_annotation.motherboardfactory;

import com.cydeo.streotype_annotation.Config.PcConfig;
import com.cydeo.streotype_annotation.PC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container= new AnnotationConfigApplicationContext(PcConfig.class);
        PC myPc=container.getBean(PC.class);

    }
}
