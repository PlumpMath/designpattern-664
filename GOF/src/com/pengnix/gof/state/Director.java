package com.pengnix.gof.state;

public class Director {
	State state;
	
	public Director(State state){
		this.state = state;
	}
	
	public void goState(State state){
		this.state = state;
	}
	
	public void showState(){
		if(state !=null){
			state.showState(this);
		}
	}
	
	public void changeState(){
		this.state.changeState(this);
	}
}
