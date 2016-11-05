package com.pengnix.gof.composite;

public abstract class Component {
	public String name;
	public Component(String name){
		this.name = name;
	}
	
	public Component(){
		this("no name");
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public void show(int dept) {
		// TODO Auto-generated method stub
		while (dept != 0) {
			dept--;
			System.out.print("-");
		}
		System.out.println(name);
	}
}
