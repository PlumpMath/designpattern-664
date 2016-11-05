package com.pengnix.gof.mediator;

public class ConcreteMediator implements Mediator {

	Colleague colleagueA;
	Colleague colleagueB;
	
	public Colleague getColleagueA() {
		return colleagueA;
	}

	public void setColleagueA(Colleague colleagueA) {
		this.colleagueA = colleagueA;
	}

	public Colleague getColleagueB() {
		return colleagueB;
	}

	public void setColleagueB(Colleague colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void sendMessage(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if(colleague instanceof ConcreteColleagueA){
			colleagueB.handleMessage(message);
		} else if(colleague instanceof ConcreteColleagueB){
			colleagueA.handleMessage(message);
		}
	}

}
