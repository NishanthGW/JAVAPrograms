package com.assignments;

public class Array_Ascendind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array1[] = {4,8,6,9,3,1,5,7};
		int temp = 0;
		System.out.print("Original Array 		 : ");
		for (int i=0; i<Array1.length; i++) {
			System.out.print(Array1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Array in ascending Order : ");
		for (int i=0; i<Array1.length; i++)
		{
			for (int j=i+1; j<Array1.length; j++)
			{
				if (Array1[i]>Array1[j]) {	
					temp = Array1[i];		
					Array1[i]=Array1[j];
					Array1[j]= temp;
				}
			}
		}
		for (int i=0; i<Array1.length; i++) {
			System.out.print(Array1[i] + " ");
		}
		
			
		

	}

}
