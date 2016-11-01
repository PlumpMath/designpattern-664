package com.pengnix.gof.simpleoperation;

public class OperationFactory {
	public static Operation getOperation(String ope){
		Operation oper;
		switch(ope){
			case "+":
				oper = new AddOperation();
				break;
			case "-":
				oper = new SubOperation();
				break;
			default:
				oper = new AddOperation();
				break;
		}
		return oper;
	}
	
}
