package com.pengnix.gof.iterator;

public class IteratorWork {
	public static void work(){
		ConcreteAggregate aggregate = new ConcreteAggregate();
		Iterator iter = aggregate.getIterator();
		aggregate.add("0");
		aggregate.add("1");
		aggregate.add("2");
		aggregate.add("3");
		aggregate.add("4");
		
		String obj = (String) iter.first();
		
		while(!iter.isDone()){
			obj = (String) iter.current();
			System.out.println(obj);
			iter.next();
		}
	}
}
