package com.woniuxy.springboot01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.springboot01.Service.SomeService;
import com.woniuxy.springboot01.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01ApplicationTests {
	
//	@Autowired
//	SomeService someService;
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	Student student;
	@Test
	public void contextLoads() {
		System.out.println(student);
	}
	
	@Test
	public void myTest() {
//		SomeService someService = (SomeService) ac.getBean("someService");
//		someService.doSome();
		System.out.println(ac.containsBean("someService"));
	}
}
