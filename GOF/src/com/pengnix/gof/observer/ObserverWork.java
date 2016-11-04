package com.pengnix.gof.observer;

public class ObserverWork {
	public static void work(){
		Subject boss = new Boss();
		Observer observer = new ConcreteObserver();
		boss.add(observer);
		boss.notifys();
	}
}
