package com.javafirst;

public class Method1a {
	public void add()
	{
		int a,b;
		a=50;
		b=150;
		int c = b+a;
		System.out.println(c);
	}
	
public static void sub()
{
	
	int a,b;
	a=40;
	b=60;
	int c = b-a;
	System.out.println(c);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1a ob = new Method1a();
		ob.add();
		sub();
		

	}

}
