package com.pengnix.gof.singleton;

public class SingletonWork {
	public static void work(){
		System.out.println(Singleton.getInstance() == Singleton.getInstance());
	}
}
