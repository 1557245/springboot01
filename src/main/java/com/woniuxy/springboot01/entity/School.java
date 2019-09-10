package com.woniuxy.springboot01.entity;

public class School {
	private int id;
	private String name;
	public School(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
