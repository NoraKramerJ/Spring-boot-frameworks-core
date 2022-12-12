package com.cydeo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger; //The Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    Logger logger= LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..))")
    public void myPointcut(){}
}
