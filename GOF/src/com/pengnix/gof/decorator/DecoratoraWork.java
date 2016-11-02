package com.pengnix.gof.decorator;

public class DecoratoraWork {
	public static void work(){
		DecoratorInterface de = new DecoratoraB(new DecoratoraA(new DecoratoraZero()));
		de.run();
	}
}
