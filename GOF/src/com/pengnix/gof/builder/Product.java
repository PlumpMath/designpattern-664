package com.pengnix.gof.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> list = new ArrayList<String>();
	
	public void add(String module){
		list.add(module);
	}
	
	public void show(){
		for(String module:list){
			System.out.println(module);
		}
	}
}
