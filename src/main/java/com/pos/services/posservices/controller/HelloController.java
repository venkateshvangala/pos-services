package com.pos.services.posservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pos.services.posservices.model.Test;


@RestController
public class HelloController {
	 @RequestMapping("/")
	public Test test(){
		Test T = new Test();
		T.setNumber(100);
		T.setTest("Hello Venkatesh Kumar V.");
		return T;
	}
}
