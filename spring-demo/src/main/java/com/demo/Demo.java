package com.demo;

import com.demo.config.AppConfig;
import com.demo.service.IDemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IDemoService demoService = applicationContext.getBean(IDemoService.class);
		demoService.sayHello();
	}
}
