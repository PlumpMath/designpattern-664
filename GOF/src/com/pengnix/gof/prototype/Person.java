package com.pengnix.gof.prototype;

public class Person implements Cloneable{
	private String name;
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	private String age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Person(String name,String age) {
		// TODO Auto-generated constructor stub
		this.name =name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
