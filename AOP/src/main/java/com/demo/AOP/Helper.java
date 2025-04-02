package com.demo.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	//@Before("execution( public void displayCourses())")
//	public void logger() {
//		System.out.println("Loggers working");
//	}
//	@Before("execution( public void displayCourses(..))")
//	public void beforeLog() {
//		System.out.println("Before Loggers working");
//	}
//	@After("execution(* com.demo.AOP.Inmakes.displayCourses(..))") //@After("execution(* *..*.displayCourses())")
//	public void afterLog() {
//		System.out.println("After Loggers working");
//	}
//	public void security() {
//		
//	}
	@Pointcut("execution(* com.demo.AOP.Inmakes.amount(..))")
	public void afterReturningPointCut(){
		
	}
	@AfterReturning(pointcut="afterReturningPointCut()",returning="retVal")
	public void afterReturn(int retVal) {
		System.out.println("Afetr returning works "+retVal);
	}

}
