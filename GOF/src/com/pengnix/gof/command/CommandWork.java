package com.pengnix.gof.command;

public class CommandWork {
	public static void work(){
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
		
		invoker.add(new ConcreteCommand(receiver));
		invoker.add(new ConcreteCommand(receiver));
		invoker.add(new ConcreteCommand(receiver));
		
		invoker.notifyReceiver();;
	}
}
