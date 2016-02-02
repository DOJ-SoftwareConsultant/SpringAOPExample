package com.doj.spring;

import org.springframework.stereotype.Component;
/*
 * @Component annotation is used to define bean.
 * It is like <bean id="body" class="com.doj.spring.Body"/>
 */
@Component
public class Body {
	
	String bodyType="STEEL";

	public String getBodyType() {
		return bodyType;
	}

}
