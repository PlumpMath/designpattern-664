package com.pengnix.gof.flyweight;

public class FlyWeightWork {
	public static void work(){
		WebsiteFactory factory = new WebsiteFactory();
		
		factory.getWebsite("1").use(new User("11"));
		factory.getWebsite("1").use(new User("12"));
		factory.getWebsite("1").use(new User("13"));
		
		factory.getWebsite("2").use(new User("21"));
		factory.getWebsite("2").use(new User("22"));
		factory.getWebsite("2").use(new User("23"));
		
		System.out.println("size is " + factory.size());
	}
}
