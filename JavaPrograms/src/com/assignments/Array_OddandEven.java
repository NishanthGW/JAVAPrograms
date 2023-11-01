package com.assignments;

public class Array_OddandEven {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int ArrayOne[] = {1,2,3,4,5,6,7,8,9,10};
				
		System.out.print("Odd Elements in Array  : ");
		for (int i=0; i<ArrayOne.length; i++)
		{
			if(ArrayOne[i]%2 != 0)
			{
			System.out.print(ArrayOne[i]+" ");
			}
		}
		
		System.out.println();
		
		System.out.print("Even Elements in Array : ");		
		for (int j=1; j<ArrayOne.length; j++)
		{
			if(ArrayOne[j]%2 == 0)
			{
			System.out.print(ArrayOne[j]+" ");
			}
		}
	
	}
}
