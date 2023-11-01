
package com.javafirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Getting the name and amount from client
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the Name : ");
		String nm = br.readLine();
		System.out.println("Amount : ");
		String nn = br.readLine();
		
		System.out.println(nm + " = " + nn);
		
		
		
		
		
		

	}

}
