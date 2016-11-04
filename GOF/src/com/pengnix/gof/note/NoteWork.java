package com.pengnix.gof.note;

public class NoteWork {
	public static void work(){
		Originator originator = new Originator();
		Role role = new Role("Yes");
		originator.recoverState(role);
		originator.show();
		
		RoleKeeper keeper = new RoleKeeper();
		keeper.setRole(originator.getRole());
		originator.setState("No");
		originator.show();
		
		originator.recoverState(keeper.getRole());
		originator.show();
	}
}
