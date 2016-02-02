package com.doj.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.doj.spring.aop.LoggingAspect;

@Configuration
/*
 * @Configuration annotation is used to define java based configuration this works like spring.xml  
 * @EnableAspectJAutoProxy in XML <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
 */
@ComponentScan(basePackages={"com.doj.spring"})
@EnableAspectJAutoProxy
public class SpringConfiguration {
	
	@Bean
	public LoggingAspect getLoggingAspect(){
		return new LoggingAspect();
	}
}
