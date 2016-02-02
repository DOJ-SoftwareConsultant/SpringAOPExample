package com.doj.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CarDemo {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Car car = (Car) context.getBean("car");
		car.startCar();
		car.driveCar(1);
		context.close();
	}
}
