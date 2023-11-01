package com.Oops;

	//Encapsulation
	//Binding or wrapping the data and method together and access the variable through getter and setter method is called Encapsulation.

class Man{
	private String name;
	private int age;
	
	//We can also create a getter and setter method by right click the variable and select the source and further select the getter and setter method.
	
	public String getname() {
		return name;
	}
	
	public void setname(String n) {
		name=n;
	}

	public int getAge() {	
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}			
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man obj = new Man();
		obj.setname("Kirithik");
		obj.setAge(17);
		System.out.println("Name : "+obj.getname());
		System.out.println("Age : "+obj.getAge());
	}

}
