package com.assignments;

import java.util.Scanner;

public class PrimeNumb {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//FInd the number is prime or not
			//Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//			In other words, prime numbers can't be divided by other numbers than itself or 1. 
//			For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
			
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



