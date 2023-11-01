package com.Oops;

interface Vehicle1{
	void Road1();//by default it is a "public abstract void Road1()";
}
class car1 implements Vehicle1
{
	public void Road1(){
		System.out.println("Ford");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 cr = new car1();
		cr.Road1();
	}
}
