package com.javafirst;

import java.util.Scanner;

public class DoWhileSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum of natural numbers (add the numbers untill the positive number)
		
		Scanner obj = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		
		do {
			sum = sum+i;
			System.out.println("Enter the value of i : ");
			i = obj.nextInt();
		}
		while (i>=0);
		System.out.println(sum);
		obj.close();
}
	
}
