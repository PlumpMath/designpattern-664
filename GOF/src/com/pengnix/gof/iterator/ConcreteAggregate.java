package com.pengnix.gof.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	List<String> list;
	
	public ConcreteAggregate(){
		list = new ArrayList<String>();
	}
	
	public String get(int index){
		return list.get(index);
	}
	
	public void add(String name){
		list.add(name);
	}
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	public int length(){
		return list.size();
	}

}
