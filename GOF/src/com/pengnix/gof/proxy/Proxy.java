package com.pengnix.gof.proxy;

public class Proxy implements BaseInterface{

	BaseInterface inter;
	public Proxy(Target target) {
		super();
		this.inter = new RealOne(target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(this.inter != null){
			inter.request();
		}
	}

}
