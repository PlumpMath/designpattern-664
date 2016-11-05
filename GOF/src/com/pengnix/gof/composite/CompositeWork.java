package com.pengnix.gof.composite;

public class CompositeWork {
	public static void work(){
		Component root = new Composite("China");
		Component leaf1 = new Leaf("beijing");
		Component composite2 = new Composite("shandong");
		Component composite3 = new Composite("weihai");
		Component leaf4 = new Leaf("yantai");
		Component leaf5 = new Leaf("huancuiqu");
		Component leaf6 = new Leaf("wendeng");
		root.add(leaf1);
		root.add(composite2);
		composite2.add(leaf4);
		composite2.add(composite3);
		composite3.add(leaf5);
		composite3.add(leaf6);
		
		root.show(0);
	}
}
