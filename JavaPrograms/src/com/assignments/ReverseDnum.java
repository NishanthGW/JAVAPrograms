package com.assignments;

import java.util.Scanner;

public class ReverseDnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = obj.nextInt();		
		int ActNum = num;
		
		int tem1 = 0;
		int RevNum = 0;
		
		while (num>0)
		{
			tem1 = num%10;
			RevNum = (RevNum*10)+tem1;
			num = num/10;
		}
		System.out.println("Actual Number   : " + ActNum);
		System.out.println("reversed Number : " + RevNum);
		
		obj.close();

	}

}
