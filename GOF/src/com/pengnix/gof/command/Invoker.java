package com.pengnix.gof.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> list;
	
	public Invoker(){
		list = new ArrayList<Command>();
	}
	
	public void add(Command command){
		list.add(command);
	}
	
	public void remove(Command command){
		list.remove(command);
	}
	
	public void notifyReceiver(){
		for(Command command:list){
			command.action();
		}
	}
	
}
