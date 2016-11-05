package com.pengnix.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	List<Component> list ;
	
	public Composite(String name) {
		super(name);
		list = new ArrayList<Component>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		list.remove(c);
	}

	@Override
	public void show(int dept) {
		// TODO Auto-generated method stub
		super.show(dept);
		for(Component c:list){
			c.show(dept + 2);
		}
	}

}
