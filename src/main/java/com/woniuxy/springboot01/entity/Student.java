package com.woniuxy.springboot01.entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//自定义配置文件位置，优先级低
@PropertySource("classpath:myspring.properties")
@Component
@ConfigurationProperties(prefix="student")
public class Student {
	//@Value("1")//可以使用value手动注入，但只能单个，符合属性不支持
	private Integer sid;
	private String name;
	private List<Object> lists;
	private Map<String, Object> maps;
	private School school;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", lists=" + lists + ", maps=" + maps + ", school=" + school
				+ "]";
	}
	public Student(Integer sid, String name, List<Object> lists, Map<String, Object> maps, School school) {
		super();
		this.sid = sid;
		this.name = name;
		this.lists = lists;
		this.maps = maps;
		this.school = school;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
