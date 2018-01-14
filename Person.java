package com.rifatiqbal.strategy_pattern;

public class Person {
	
	/**
	 * Person Class: 
	 * Super class
	 */
	protected String name;
	protected int age;
	protected String address;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}