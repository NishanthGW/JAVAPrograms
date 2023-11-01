package com.Oops;

public class Car implements Vehicle {
	public void road() {
		System.out.println("Ford car");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car crr = new Car();
		crr.road();
	}
}
