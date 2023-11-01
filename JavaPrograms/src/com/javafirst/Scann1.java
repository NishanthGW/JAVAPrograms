package com.javafirst;

import java.util.Scanner;

public class Scann1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = obj.nextLine();
		System.out.println("Enter the amount : ");
		double amt = obj.nextDouble();
		
		System.out.println(name);
		System.out.println(amt);
		
		obj.close();
		

	}

}
