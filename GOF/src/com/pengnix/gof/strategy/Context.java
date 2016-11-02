package com.pengnix.gof.strategy;

public class Context {

	Strategy strategy;

	public Context(String type) {
		// TODO Auto-generated constructor stub
		switch (type) {
		case "A":
			strategy = new StrategyA();
			break;
		case "B":
			strategy = new StrategyB();
			break;
		default:
			strategy = new StrategyA();
			break;
		}
	}

	public void work() {
		strategy.work();
	}

}
