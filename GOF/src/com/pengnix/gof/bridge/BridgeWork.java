package com.pengnix.gof.bridge;

public class BridgeWork {
	public static void work(){
		RefinedAbstraction refinedAbs = new RefinedAbstraction();
		refinedAbs.setImlp(new ImplementorA());
		refinedAbs.operate();
		refinedAbs.setImlp(new ImplementorB());
		refinedAbs.operate();
	}
}
