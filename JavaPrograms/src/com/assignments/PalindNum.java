package com.assignments;

import java.util.Scanner;

public class PalindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Number : ");
		int num = obj.nextInt(); //12345
		
		int Actual = num;
		int sum = 0;
		int rev = 0;
		
		while (num>0)
		{
			sum = num%10; //5 4 3 2 1
			rev = (rev*10)+sum; //5 54 543 5432 54321
			num = num/10; //1232 123 12 1
		}
		System.out.println("Actual Number   : " + Actual);
		System.out.println("reversed Number : " + rev);
		
		if (rev==Actual) //54321 == 123456 is wrong
		{
			System.out.println(Actual + " is a Palindrome");
		}
		else
		{
			System.out.println(Actual + " is not a Palindrome");
		}
		obj.close();

	}

}
