package com.pengnix.gof.prototype;

public class ProtoTypeWork {

	public static void work(){
		
		try {
			Resume resumeA = new Resume("1","1","1");
			Resume resumeB = (Resume) resumeA.clone();
			resumeB.setInfo("2", "2", "2");
			System.out.println(resumeA);
			System.out.println(resumeB);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
