package com.assignments;

import java.util.Scanner;

public class NumPatt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("value of e : ");
		int n = obj.nextInt();
		
		for (int e=n; e>=1; e--)
		{
			for (int f=1; f<=e; f++)
			{
				System.out.print(f);
			}
			System.out.println();
		}
		
		
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		obj.close();
		}
	}
	


