package com.pengnix.gof.responsiblitychain;

public class HandlerA extends Handler {

	@Override
	public void handRequest(int number) {
		// TODO Auto-generated method stub
		if(number < 10){
			System.out.println("HandlerA");
		} else if(successor != null){
			successor.handRequest(number);
		}
	}

}
