package com.javafirst;

public class ArraySamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SIngle Dimensional array
		int a[] = new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]);
			System.out.println();
		
		int b[] = {5,6,7,2,5,8};
		
		for (int j=0; j<b.length; j++)
			System.out.print(b[j]);
			System.out.println();
		
		/*int c[] = {7,8,9,4,2,5,6};
		for (int z : c) //for each method
			System.out.print(c[z]);*/

	}

}
