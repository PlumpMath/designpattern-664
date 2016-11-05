package com.pengnix.gof.iterator;

public class ConcreteIterator implements Iterator {

	ConcreteAggregate aggregate;
	int index;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
		index = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		index = 0;
		return aggregate.get(index);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		index++;
		if (index < aggregate.length()) {
			return aggregate.get(index);
		} else {
			return null;
		}
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return index >= aggregate.length();
	}

	@Override
	public Object current() {
		// TODO Auto-generated method stub
		return aggregate.get(index);
	}

}
