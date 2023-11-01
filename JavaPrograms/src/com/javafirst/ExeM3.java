package com.javafirst;

public class ExeM3 {
	public double Areaofcircle(double r)
	{
		double AOC = 3.14*r*r;
		return AOC;
	
	}
	public double Areaoftriangle(double b, double h)
	{
		double AOT = (b*h)/2;
		return AOT;
	
	}
	public double Areaofsquare(double a)
	{
		double AOS = a*a;
		return AOS;
	
	}
	
	public static void print() {
		System.out.println("Its a great day");
		System.out.println("void will return nothing");
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeM3 ob = new ExeM3();
		double circle = ob.Areaofcircle(20);
		System.out.println(circle);
		double Triangle = ob.Areaoftriangle(10,20);
		System.out.println(Triangle);
		double Square = ob.Areaofsquare(30);
		System.out.println(Square);
		System.out.println("===================");
		ExeM3.print();
		
		

	}

}
