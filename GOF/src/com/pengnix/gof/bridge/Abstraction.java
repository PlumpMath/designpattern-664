package com.pengnix.gof.bridge;

public abstract class Abstraction {
	protected Implementor imlp;
	
	public void setImlp(Implementor imlp) {
		this.imlp = imlp;
	}

	public abstract void operate(); 
}
