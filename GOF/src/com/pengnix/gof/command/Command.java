package com.pengnix.gof.command;

public abstract class Command {
	Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	public abstract void action();
}
