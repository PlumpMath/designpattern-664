package com.pengnix.gof.responsiblitychain;

public class HandlerB extends Handler {

	@Override
	public void handRequest(int number) {
		// TODO Auto-generated method stub
		if(number > 20){
			System.out.println("no way");
		} else{
			System.out.println("HandlerB");
		}
	}

}
