package com.doj.spring;

import org.springframework.stereotype.Component;
/*
 * @Component annotation is used to define bean.
 * It is like <bean id="engine" class="com.doj.spring.Engine"/>
 */
@Component
public class Engine {
	
	final String engineName="FORD";

	public String getEngineName() {
		return engineName;
	}

}
