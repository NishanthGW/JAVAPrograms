package com.javafirst;

abstract class bike {			//(Parent Class)

	bike() {					//Constructor
	System.out.println("Constructor");
}
	abstract void run(); 	//Abstraction method )
	
	void run1()				//Non Abstraction method
	{
		System.out.println("Non Abstract method");
	}
}

class Yamaha extends bike //Extended Abstract method (Child class)
{
	void run()
	{
		System.out.println("Extended Abstract method");
	}
}

public class AbstractSam {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object has to create for a child class/its a rule
		
		Yamaha h = new Yamaha();
		h.run();
//		h.run1();
	}

}
