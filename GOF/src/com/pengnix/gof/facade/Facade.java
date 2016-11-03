package com.pengnix.gof.facade;

public class Facade {

	SubSystemA subA;
	SubSystemB subB;
	public Facade() {
		// TODO Auto-generated constructor stub
		subA = new SubSystemA();
		subB = new SubSystemB();
	}
	
	public void requestA(){
		subA.requestB();
		subB.requestA();
	}
	
	public void requstB(){
		subA.requestA();
		subB.requestB();
	}

}
