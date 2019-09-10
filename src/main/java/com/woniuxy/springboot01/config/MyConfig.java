package com.woniuxy.springboot01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniuxy.springboot01.Service.SomeService;

@Configuration
public class MyConfig {
	//value属性指定bean的id，默认id为方法名
	@Bean(value="someService")
	public SomeService getSomeService() {
		return new SomeService();
	}
}
