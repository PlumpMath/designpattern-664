package com.pengnix.gof.template;

public abstract class AbstractSubject {
	public abstract void doRealThing();
	public void work(){
		doRealThing();
	}
}
