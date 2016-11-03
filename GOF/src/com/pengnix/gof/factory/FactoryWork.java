package com.pengnix.gof.factory;

import com.pengnix.gof.simpleoperation.Operation;

public class FactoryWork {
	public static void work(){
		IFactory factory = new AddFactory();
		Operation operation = factory.createOperation();
		operation.setPara1(3);
		operation.setPara2(1);
		System.out.println(operation.operation());
		factory = new SubFactoty();
		operation = factory.createOperation();
		operation.setPara1(3);
		operation.setPara2(1);
		System.out.println(operation.operation());
	}
}
