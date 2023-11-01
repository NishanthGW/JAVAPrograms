package com.assignments;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int k=1; k<=6; k++)
		 {
			 for (int f=1; f<=k; f++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		
		 for (int i=1; i<=6; i++)
		 {
			 for (int j=6; j>=i; j--)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 
		 

	}

}
