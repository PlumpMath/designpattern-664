package com.pengnix.gof.factory;

import com.pengnix.gof.simpleoperation.Operation;
import com.pengnix.gof.simpleoperation.SubOperation;

public class SubFactoty implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new SubOperation();
	}

}
