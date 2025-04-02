package com.demo.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Aspect
@Component
@EnableAspectJAutoProxy
public class AuthenticationAspect {
	
//	@Pointcut("within(com.demo.AOP.Inmakes)")
//	public void authorizationPointCut() {
//		
//	}
//	@Pointcut("within(com.demo.AOP.Inmakes)")
//    public void authenticationPointCut() {
//		
//	}
//	@Before("authorizationPointCut() && authenticationPointCut()")
//	public void authorization(JoinPoint jp) {
//		System.out.println(jp.getSignature());
//		System.out.println("Authenticating request..");
//		
//	}
	

}
