package com.pengnix.gof.mediator;

public class MediatorWork {
	public static void work(){
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague colleagueA = new ConcreteColleagueA(mediator);
		Colleague colleagueB = new ConcreteColleagueB(mediator);
		
		mediator.setColleagueA(colleagueA);
		mediator.setColleagueB(colleagueB);
		
		colleagueA.sendMessage("");
		colleagueB.sendMessage("");
	}
}
