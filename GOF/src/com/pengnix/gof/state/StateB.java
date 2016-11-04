package com.pengnix.gof.state;

public class StateB implements State {

	@Override
	public void changeState(Director director) {
		// TODO Auto-generated method stub
		director.goState(new StateA());
	}

	@Override
	public void showState(Director director) {
		// TODO Auto-generated method stub
		System.out.println("this is stateB");
	}

}
