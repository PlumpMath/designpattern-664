package com.pengnix.gof.strategy;

public class StrategyWork {
	public static void work(){
		Context context = new Context("A");
		context.work();
		context = new Context("B");
		context.work();
	}
}
