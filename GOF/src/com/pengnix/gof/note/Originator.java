package com.pengnix.gof.note;

public class Originator {
	public String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Role getRole(){
		return new Role(state);
	}
	
	public void recoverState(Role role){
		this.state = role.getState();
	}
	
	public void show(){
		System.out.println("state:" + state);
	}
}
