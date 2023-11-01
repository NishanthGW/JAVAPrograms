package com.assignments;

import java.util.Scanner;

public class SwapWi3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 10;
		int b = 15;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);*/
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("a=");
		int a = obj.nextInt();
		
		System.out.println("b=");
		int b = obj.nextInt();
		
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		obj.close();
				
		
		
		
	}

}
