package com.pengnix.gof.adapter;

public class Adapter implements Target{

	Adaptee adaptee;
	public Adapter() {
		// TODO Auto-generated constructor stub
		adaptee = new Adaptee();
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(adaptee != null){
			adaptee.specialRequest();
		}
	}
	
	

}
