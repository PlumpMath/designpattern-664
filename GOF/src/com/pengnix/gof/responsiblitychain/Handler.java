package com.pengnix.gof.responsiblitychain;

public abstract class Handler {
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handRequest(int number);
}
