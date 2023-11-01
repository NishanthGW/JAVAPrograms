package com.assignments;

public class Array_MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{4,5}};
		int b[][]= {{3,4},{7,2}};
		
		System.out.println("Matrix a");
		for (int i=0; i<2; i++) //here we are checking 0 and 1. Thats why i<2
		{
			for (int j=0; j<2; j++)
			{
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Matrix b");
		for (int i=0; i<2; i++) //here we are checking 0 and 1. Thats why i<2
		{
			for (int j=0; j<2; j++)
			{
			System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Addition of Matrix a & b :");
		for (int i=0; i<2; i++) //here we are checking 0 and 1. Thats why i<2
		{
			for (int j=0; j<2; j++)
			{
			System.out.print((a[i][j] + b[i][j]) + " ");
			}
			System.out.println();
		}
		

	}

}
