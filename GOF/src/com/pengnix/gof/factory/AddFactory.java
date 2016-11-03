package com.pengnix.gof.factory;

import com.pengnix.gof.simpleoperation.AddOperation;
import com.pengnix.gof.simpleoperation.Operation;

public class AddFactory implements IFactory{

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return  new AddOperation();
	}

}
