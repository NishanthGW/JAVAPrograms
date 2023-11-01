package com.assignments;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding duplicate array
		int Array1[] = {4,8,6,2,1,8,6};
		
		System.out.print("Duplicate Elements in Array1 = ");
		for (int i=0; i<Array1.length; i++)
		{
			for (int j=i+1; j<Array1.length; j++)
			{
				if (Array1[i] == Array1[j])
				{
					System.out.print(Array1[j]+" ");
				}
			}
		}
		System.out.println();
		System.out.println();

		int a[]= {5,8,3,4,8,5,6};
		System.out.print("Duplicate Elements : ");
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(" "+a[i]);
					a[i]=-4;
				}				
			}
		}
		System.out.println();
		System.out.println("after removed duplicate elements: ");
		for (int i=0; i<a.length; i++) {
			if(a[i]!=-4) {
				System.out.print(" "+a[i]);
			}
		}
		
		
	}

}
