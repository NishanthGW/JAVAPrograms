package com.Oops;

abstract class car112{
	
	abstract void ft();
	
	void rr() {
		System.out.println("Rolls-Royce");
	}
	
	car112(){
		System.out.println("luxury cars");
	}
}
class Vehi extends car112{
	void ft() 
	{
		System.out.println("lorry");
	}
}
public class Abstractcl extends car112{
	void ft() {
		System.out.println("Abstaction");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractcl obj = new Abstractcl();
		obj.ft();
		obj.rr();

	}


		
	

}
