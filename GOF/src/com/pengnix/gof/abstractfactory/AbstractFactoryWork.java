package com.pengnix.gof.abstractfactory;

public class AbstractFactoryWork {
	public static void work(){
		try {
			IUser iUser = new DataAccess().createUser();
			iUser.insert();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
