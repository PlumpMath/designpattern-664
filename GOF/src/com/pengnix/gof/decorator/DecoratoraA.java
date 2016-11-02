package com.pengnix.gof.decorator;

public class DecoratoraA extends Decorator {
	
	public DecoratoraA(DecoratorInterface inter) {
		super(inter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("decoratorA");
	}

}
