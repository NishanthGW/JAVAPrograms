package com.javafirst;

import java.util.Scanner;

public class StuMrk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Student Name: ");
		String name = obj.nextLine();
		System.out.println("Calss : ");
		int cls = obj.nextInt();
		System.out.println("Tamil - ");
		double S1 = obj.nextDouble();
		System.out.println("English - ");
		double S2 = obj.nextDouble();
		System.out.println("Maths - ");
		double S3 = obj.nextDouble();
		System.out.println("Science - ");
		double S4 = obj.nextDouble();
		System.out.println("Social - ");
		double S5 = obj.nextDouble();
		
		System.out.println("Name : " + name);
		System.out.println("Standard : " + cls);
		System.out.println("Tamil = " + S1);
		System.out.println("English = " + S2);
		System.out.println("Maths = " + S3);
		System.out.println("Science = " + S4);
		System.out.println("Social = " + S5);
		System.out.println("Total = " + (S1+S2+S3+S4+S5));
		System.out.println("Average = " + (S1+S2+S3+S4+S5)/5);
		
		obj.close();
		

	}

}
