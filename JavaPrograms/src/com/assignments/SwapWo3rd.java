package com.assignments;

import java.util.Scanner;

public class SwapWo3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x = 8;
		int y = 10;
		
		x = x+y; //x=18
		y = x-y; //y=8
		//y = x+y; //y=(18+8)=26
		System.out.println(x);
		System.out.println(y);*/
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Value of x=");
		int x = obj.nextInt();
		
		System.out.println("Value of y=");
		int y = obj.nextInt();
		
		
		x = x+y;
		y = x-y;
		y = x+y;
		System.out.println(x);
		System.out.println(y);
		
		obj.close();

	}

}
