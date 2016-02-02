package com.doj.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(* com.doj.spring.Car.driveCar(int))")
	public void getDL(){}
	
	@Pointcut("execution(* com.doj.spring.Car.driveCar()) || within(com.doj.spring.Car)")
	public void getBasic(){}
	
	@Pointcut("execution(* com.doj.spring.Car.driveCar(int)) and args(carNumber1)")
	public void getExpert(){}

	@Before("getBasic() || getDL()")
	public void getDrivingLiensense(JoinPoint joinPoint){
		System.out.println("Before Driving Get Driving Liencense!!!"+joinPoint.getSignature().getDeclaringTypeName());
	}
	
	@Before("getBasic()")
	public void getBasicAboutCar(JoinPoint joinPoint){
		System.out.println("Get Basic Knowledge about Car!!!"+joinPoint.toLongString());
	}
	
	@After("execution(* com.doj.spring.Car.driveCar(..))")
	public void getElegibleForDriving(JoinPoint joinPoint){
		System.out.println("You are eligible for drive a Car!!!"+joinPoint.getKind());
	}
	
	@AfterReturning("getExpert()")
	public void getExpertInDriving(JoinPoint joinPoint){
		System.out.println("You are expert in Driving!!!"+joinPoint.getStaticPart().getKind());
	}
	
	@AfterThrowing("execution(* com.doj.spring.Car.driveCar(..))")
	public void getNotElegibleForDriving(JoinPoint joinPoint){
		System.out.println("You are not eligible for drive a Car!!!");
	}
	
	/*@Around("execution(* com.doj.spring.Car.driveCar(..))")
	public void checkYourCar(JoinPoint joinPoint){
		System.out.println("Check your car before and after driving a Car!!!");
	}*/
}
