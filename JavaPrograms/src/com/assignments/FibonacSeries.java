package com.assignments;

import java.util.Scanner;

public class FibonacSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = obj.nextInt();
		
		int sum = 0;
		int a = 0;
		int b = 1;
		sum = a + b;
		
		if (n<2)
		{
			System.out.println("0");
		}
		
		else
		for (int i=2; i<n; i++)
		{
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(sum+" ");
		}
		obj.close();

	}

}
