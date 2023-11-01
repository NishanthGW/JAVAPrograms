package com.javafirst;

import java.util.Scanner;

public class ForBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of "n" numbers
		 int i;
		 int temp = 0;
		 Scanner obj = new Scanner(System.in);
		 
		 System.out.println("Enter the value of n :");
		 int n = obj.nextInt();
		 
		 obj.close();
		 
		 for (i=1; i<=n; i++)
		 {
			 temp = temp+i;
			 System.out.println(temp);
		 }

		 

	}

}
