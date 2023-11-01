package com.javafirst;

public class Method1Exe1 {
	public void multi()
	{
		int a,b;
		a=11;
		b=23;
		int c = a*b;
		System.out.println(c);
	}
	
	public void divi()
	{
		int a,b;
		a=11;
		b=55;
		int c = b/a;
		System.out.println(c);
		
	}
	public void avg()
	{
		double a,b;
		a=85;
		b=96;
		double c = (a+b)/2;
		System.out.println(c);
		
	}
	
	public static void mod()
	{
		double a,b;
		a=12;
		b=37;
		double c = b%a;
		System.out.println(c);
		
	}
	
	public static void Sqr()
	{
		double a;
		a=12;
		double c = a*a;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1Exe1 ob = new Method1Exe1();
		ob.multi();
		ob.divi();
		ob.avg();
		mod();
		Sqr();

	}

}
