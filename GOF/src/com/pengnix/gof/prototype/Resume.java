package com.pengnix.gof.prototype;

public class Resume {

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	private Person person;
	private String schoolName;
	
	public Resume(String name,String age,String schoolName) {
		// TODO Auto-generated constructor stub
		person = new Person(name,age);
		this.schoolName = schoolName;
	}
	
	public void setInfo(String name,String age,String schoolName){
		this.person.setAge(name);
		this.person.setName(age);
		this.schoolName = schoolName;
	}
	
	public Resume(Person person) throws CloneNotSupportedException {
		// TODO Auto-generated constructor stub
		this.person = (Person) person.clone();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume resume = new Resume(this.person);
		return resume;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + person.getName() + " age:" + person.getAge() + " schoolName:" + this.getSchoolName();
	}
	
	

}
