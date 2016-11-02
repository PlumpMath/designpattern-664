package com.pengnix.gof.proxy;

public class RealOne implements BaseInterface {

	Target target;
	
	public RealOne(Target target){
		this.target = target;
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("realone do ");
		target.getInfo();
	}

}
