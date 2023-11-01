package com.javafirst;

class one //Parent Class
{
	void Sky(){
		System.out.println("Parent Class");
	}
	void Sea(){
		System.out.println("Parent Class Method");
	}
}

class two extends one //Child Class
{ 
	void Sky() {
		System.out.println("Child Class");
		super.Sky();
	}
}

public class Single_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two element = new two();
		element.Sky();
		element.Sea();	

	}

}
