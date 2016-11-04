package com.pengnix.gof.state;

public class StateA implements State {

	@Override
	public void changeState(Director director) {
		// TODO Auto-generated method stub
		director.goState(new StateB());
	}

	@Override
	public void showState(Director director) {
		// TODO Auto-generated method stub
		System.out.println("this is stateA");
	}


}
