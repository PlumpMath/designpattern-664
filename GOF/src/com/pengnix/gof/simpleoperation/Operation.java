package com.pengnix.gof.simpleoperation;

public abstract class Operation {
	public double getPara1() {
		return para1;
	}
	public void setPara1(double para1) {
		this.para1 = para1;
	}
	public double getPara2() {
		return para2;
	}
	public void setPara2(double para2) {
		this.para2 = para2;
	}
	private double para1;
	private double para2;
	public abstract double operation();
}
