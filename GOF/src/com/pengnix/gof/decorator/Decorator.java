package com.pengnix.gof.decorator;

public abstract class Decorator implements DecoratorInterface {
	DecoratorInterface inter;

	public Decorator(DecoratorInterface inter) {
		this.inter = inter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(inter != null){
			inter.run();
		}
	}

}
