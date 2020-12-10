package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {
	@Override
	public void sayHello() {
		System.out.println("hello");
	}
}
