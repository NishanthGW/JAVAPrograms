package com.javafirst;

public class Method1 {

	public void add()
	{
		int a,b;
		a=110;
		b=230;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void sub() // it can be called only within a class
	{
		int a,b;
		a=110;
		b=230;
		int c = b-a;
		System.out.println(c);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1 ob = new Method1();
		ob.add();
		sub();

	}

}
