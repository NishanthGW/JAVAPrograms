package com.javafirst;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the UserName : ");
		String name = obj.nextLine();
		System.out.println("Enter the Age : ");
		int age = obj.nextInt();
		System.out.println("Enter the amount of monthly salary : ");
		double sal = obj.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		
		obj.close();
		

	}

}
