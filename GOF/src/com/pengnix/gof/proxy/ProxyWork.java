package com.pengnix.gof.proxy;

public class ProxyWork {
	public static void work(){
		Proxy proxy = new Proxy(new Target());
		proxy.request();
	}
}
