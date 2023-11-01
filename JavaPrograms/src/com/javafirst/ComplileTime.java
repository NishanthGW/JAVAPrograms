package com.javafirst;

public class ComplileTime {
	
	public void multiply()
	{
		System.out.println("This Method Overloading");
	}
	
	public int multiply (int x)
	{
		int c = x*x;
		System.out.println(c);
		return c;
	}
	
	public int multiply (int a, int b)
	{
		int c = a*b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplileTime over = new ComplileTime();
		over.multiply();
		over.multiply(20);
		over.multiply(10,20);
	}

}
