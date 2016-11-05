package com.pengnix.gof.mediator;

public abstract class Colleague {
	public Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void sendMessage(String message);

	public void handleMessage(String message) {
		System.out.println(message);
	}
}
