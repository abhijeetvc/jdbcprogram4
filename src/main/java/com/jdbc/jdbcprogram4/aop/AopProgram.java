package com.jdbc.jdbcprogram4.aop;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//AOP Terminology: Aspect, JoinPoint, Pointcut, Advice
// Aspect: It is a cross-cutting concern
// Advice: After, Before, AfterReturning, Around, AfterThrowing
// Pointcut : Scenario which matches to joinpoint
// Joinpoint: It represents execution of method
@Component
@Aspect
public class AopProgram {

    @Before(" execution(* com.jdbc.jdbcprogram4.dao.EmployeeDao.getEmp(..))")
    public void doSomething(){
        System.out.println("Hiiiiiiii!!!! In DoSomething method");
    }
}
