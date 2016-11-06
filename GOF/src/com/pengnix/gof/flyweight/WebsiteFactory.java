package com.pengnix.gof.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
	Map<String,Website> map;
	
	public WebsiteFactory(){
		map = new HashMap<String,Website>();
	}
	
	public Website getWebsite(String catogory){
		if(!map.containsKey(catogory)){
			map.put(catogory, new ConcreteWebsite());
//			System.out.println("insert:" + catogory);
		}
		return map.get(catogory);
	}
	
	public int size(){
		return map.size();
	}
}
