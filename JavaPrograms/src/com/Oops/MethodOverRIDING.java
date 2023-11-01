package com.Oops;

class Maruti{
	public void one() {
		System.out.println("Maruti car");
	}
}
class jeep extends Maruti{ //with the help method jeep we are overriding the parent method(method maruti) 
	public void one() {
		System.out.println("Nexa cars");
	}
}
public class MethodOverRIDING {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jeep obj = new jeep();
		obj.one();		
	}
}
