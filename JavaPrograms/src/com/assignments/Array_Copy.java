package com.assignments;

public class Array_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr1[] = {7,8,9,4,5,6};
		
		System.out.print("Elements of Array     - Arr1 : ");
		
		for (int j=0; j<Arr1.length; j++){
			System.out.print(Arr1[j] + " ");
		}
		System.out.println();
		
		int Arr2[] = new int[Arr1.length];
		
		for (int i=0; i<Arr1.length; i++)
		{
			Arr2[i] = Arr1[i];
		}
		
		System.out.print("Elements of new Array - Arr2 : ");
		
		for (int k=0; k<Arr2.length; k++)
		{
			System.out.print(Arr2[k] + " ");
		}
		

	}

}
