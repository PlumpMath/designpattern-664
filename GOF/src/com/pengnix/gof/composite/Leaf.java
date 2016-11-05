package com.pengnix.gof.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("add leaf " + name);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("remove leaf " + name);
	}

}
