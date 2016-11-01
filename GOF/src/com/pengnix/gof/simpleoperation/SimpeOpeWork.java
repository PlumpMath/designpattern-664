package com.pengnix.gof.simpleoperation;

public class SimpeOpeWork {
	public static void work(){
		Operation operation = null;
		operation = OperationFactory.getOperation("-");
		operation.setPara1(88);
		operation.setPara2(11);
		System.out.println(operation.operation());
	}
}
