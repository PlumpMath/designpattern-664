package com.pengnix.gof.mediator;

public class ConcreteColleagueB extends Colleague{

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		mediator.sendMessage("ConcreteColleagueB send", this);
	}

}
