package com.assignments;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Ar1[] = {6,5,4,3,2,1};
		
		System.out.print("Elements of Array in Forward order  : ");
		for (int i=0; i<Ar1.length; i++) {
			System.out.print(Ar1[i]+" ");}
			System.out.println();
		
		System.out.print("Elements of Array in Reversed order : ");
		for (int j=(Ar1.length-1); j>=0; j--)
			System.out.print(Ar1[j]+" ");
	

	}

}
