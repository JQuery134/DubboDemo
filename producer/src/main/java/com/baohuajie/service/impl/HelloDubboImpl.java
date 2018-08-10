package com.baohuajie.service.impl;

import interfaceout.interfaceout.HelloDubbo;

public class HelloDubboImpl implements HelloDubbo{

	@Override
	public String sayHello(String name) {
		System.out.println("--------------");
		return "baohaujie"+name;
	}

}
