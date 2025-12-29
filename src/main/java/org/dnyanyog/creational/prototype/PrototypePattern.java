package org.dnyanyog.creational.prototype;

interface Prototype{
	Prototype clone();
}

class Student implements Prototype {
	
	int age;
	private int rollNumber;
	String name;
	
	Student(){
	}
	
	Student(int age, int rollNumber, String name){
		this.age=age;
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	@Override
	public Prototype clone() {
		return new Student(age, rollNumber, name);
	}
}

public class PrototypePattern {

	public static void main(String[] args) {
		
		Student obj = new Student(20, 75, "Ram");
		Student cloneObj = (Student) obj.clone();
	}
}
