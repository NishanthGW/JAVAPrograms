package com.javafirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Merging of first and last name
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the first Name : ");
		String a = br.readLine();
		System.out.println("Enter the LastName : ");
		String b = br.readLine();
		System.out.println(a + " " + b);

	}

}
