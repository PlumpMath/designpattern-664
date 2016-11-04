package com.pengnix.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {

	List<Observer> list = new ArrayList<Observer>();
	
	@Override
	public void notifys() {
		// TODO Auto-generated method stub
		for(Observer obv:list){
			obv.update();
		}
	}

	@Override
	public void add(Observer obv) {
		// TODO Auto-generated method stub
		list.add(obv);
	}

	@Override
	public void remove(Observer obv) {
		// TODO Auto-generated method stub
		list.remove(obv);
	}
	
	

}
