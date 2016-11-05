package com.pengnix.gof.mediator;

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		mediator.sendMessage("ConcreteColleagueA send", this);
	}

}
