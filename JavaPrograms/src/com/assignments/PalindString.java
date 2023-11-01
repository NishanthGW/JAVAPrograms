package com.assignments;

import java.util.Scanner;

public class PalindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the word : ");
		String str = obj.nextLine();
		
		String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) 
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }
	      System.out.println(reverseStr);

	    if (str.toLowerCase().equals(reverseStr.toLowerCase()))
	    {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	    obj.close();
		
	}

}
