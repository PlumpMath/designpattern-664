package com.pengnix.gof.state;

public class StateWork {
	public static void work(){
		Director director = new Director(new StateA());
		director.showState();
		director.changeState();
		director.showState();
		director.changeState();
		director.showState();
	}
}
