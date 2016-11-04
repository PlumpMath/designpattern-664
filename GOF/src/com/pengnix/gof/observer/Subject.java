package com.pengnix.gof.observer;



public interface Subject {
	public void notifys();
	public void add(Observer obv);
	public void remove(Observer obv);
}
