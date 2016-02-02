package com.doj.spring;

import org.springframework.stereotype.Component;
/*
 * @Component annotation is used to define bean.
 * It is like <bean id="Tyre" class="com.doj.spring.Tyre"/>
 */
@Component
public class Tyre {
	
	String tyreName="MRF";

	public String getTyreName() {
		return tyreName;
	}

}
