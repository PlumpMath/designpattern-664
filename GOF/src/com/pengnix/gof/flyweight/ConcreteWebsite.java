package com.pengnix.gof.flyweight;

public class ConcreteWebsite implements Website {

	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("user : " + user.getName());
	}

}
