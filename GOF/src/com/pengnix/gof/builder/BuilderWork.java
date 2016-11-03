package com.pengnix.gof.builder;

public class BuilderWork {
	public static void work(){
		ConcreteBuilderA builder = new ConcreteBuilderA();
		new Director().construct(builder);
		builder.getProduct().show();
	}
}
