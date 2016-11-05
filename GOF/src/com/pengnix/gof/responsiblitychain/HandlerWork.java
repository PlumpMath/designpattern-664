package com.pengnix.gof.responsiblitychain;

public class HandlerWork {
	public static void work(){
		Handler hA = new HandlerA();
		Handler hB = new HandlerB();
		hA.setSuccessor(hB);
		
		int arr[] = {5,15,25};
		for(int number:arr){
			hA.handRequest(number);
			System.out.println("");
		}
	}
}
