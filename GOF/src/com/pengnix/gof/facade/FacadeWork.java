package com.pengnix.gof.facade;

public class FacadeWork {
	public static void work(){
		Facade facade = new Facade();
		facade.requestA();
		facade.requstB();
	}
}
