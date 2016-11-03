package com.pengnix.gof.template;

public class TemplateWork {
	public static void work(){
		AbstractSubject subject = new ConcreteSubjectA();
		subject.work();
		subject = new ConcreteSubjectB();
		subject.work();
	}
}
