package com.baohuajie.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("�����ṩ�߿�����");
		ClassPathXmlApplicationContext prodiver = new ClassPathXmlApplicationContext("spring.xml");
		prodiver.start();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
