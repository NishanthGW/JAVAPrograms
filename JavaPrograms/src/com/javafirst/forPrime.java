package com.javafirst;

import java.util.Scanner;

public class forPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FInd the number is prime or not
		
		int num, i, isPrime = 0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		num = obj.nextInt(); 
		
		obj.close();
		
		for (i=2; i <= (num/2); i++)
		{
			if (num%i == 0)
			{
				isPrime = 1;
				break;
			}
		}
			if (isPrime == 0)
				System.out.println(num + " is a Prime Number.");
			else
				System.out.println(num + " is not a Prime Number.");
			
			
		}
		
		

	}


