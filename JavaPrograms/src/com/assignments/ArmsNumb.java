package com.assignments;

import java.util.Scanner;

public class ArmsNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Number to be check : ");
		int num = obj.nextInt();
		//153
		
		int x = num;
		int sum = 0;
		int result = 0;
		
		while (num>0)
		{
			sum = num%10; //3
			num = num/10; //15
			result+= Math.pow(sum, 3);
			System.out.println(result);
		}
		
		if (result == x)
		{
			System.out.println(x + " is an Armstrong number");
		}
		else
		{
			System.out.println(x + " is not an Armstrong number");
		}
		obj.close();

	}

}
