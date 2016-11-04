package com.pengnix.gof.abstractfactory;

public class DataAccess {
	private static String className = "com.pengnix.gof.abstractfactory." + "OrcaleIUser";
	public IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return (IUser) Class.forName(className).newInstance();
	}
}
