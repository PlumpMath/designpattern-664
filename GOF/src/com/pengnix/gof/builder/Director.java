package com.pengnix.gof.builder;

public class Director {
	public void construct(BuilderInterface builder){
		builder.buildModule();
	}
}
