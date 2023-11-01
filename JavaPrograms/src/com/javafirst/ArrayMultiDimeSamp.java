package com.javafirst;

public class ArrayMultiDimeSamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array - MultiDimensional
		int a[][]= {{1,2},{4,5}};
		
		for (int i=0; i<2; i++) //here we are checking 0 and 1. Thats why i<2
		{
			for (int j=0; j<2; j++)
			System.out.print(a[i][j] + " ");
			System.out.println();
		}
		
		/*int i=0;
		for (int j=0; j<2; j++)
		System.out.print(a[i][j] + " ");
		System.out.println();
		
		i=1;
		for (int j=0; j<2; j++)
			System.out.print(a[i][j] + " ");*/
			

	}

}
