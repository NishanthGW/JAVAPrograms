package com.assignments;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first value : ");
		double a = obj.nextDouble();
		
		System.out.println("Enter the second value : ");
		double b = obj.nextDouble();
		
		System.out.println("Enter the Operator : +, -, *, /");
		char opr = obj.next().charAt(0);
		
		double result;
		
		switch (opr) {
		case '+':
			result = a + b;
			System.out.println(a + " + " + b + " = " + result);
			break;
		case '-':
			result = a - b;
			System.out.println(a + " - " + b + " = " + result);
			break;
		case '*':
			result = a * b;
			System.out.println(a + " * " + b + " = " + result);
			break;
		case '/':
			result = a / b;
			System.out.println(a + " / " + b + " = " + result);
			break;
		default:
			System.out.println("Please enter the valid operator!");
		}
		
		
		/*SSystem.out.println("Enter the first value : ");
		double a = obj.nextDouble();
		
		System.out.println("Enter the second value : ");
		double b = obj.nextDouble();
		
		System.out.println("'1' - Addition");
		System.out.println("'2' - subtraction");
		System.out.println("'3' - Multiplication");
		System.out.println("'4' - Division");
		System.out.println();

		System.out.println("Select the Operation");		
		int opr  = obj.nextInt();

		double A = a+b;
		double B = a-b;
		double C = a*b;
		double D = a/b;
		
		if (opr = 1)
		System.out.println("Addition of a and b = " + A);
		
		else if (opr = 2)
			System.out.println("Subraction of a and b = "+ B);
		
		else if (opr = 3) 
			System.out.println("Multiplication of a and b = "+ C);
		
		else if (opr = 4) 
		System.out.println("Division of a and b = "+ D);
		
		else 
			System.out.println("Invalid Input, please Enter '1' or '2' or '3' or '4'.");*/
		
		obj.close();
	
	}
}
