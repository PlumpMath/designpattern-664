package com.pengnix.gof.adapter;

public class AdapterWork {
	public static void work(){
		Target target = new Adapter();
		target.request();
	}
}
