package com.javafirst;

public class forexex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		
		int arr1[] = {3, 5, 6, 5, 11, 9, 4};
		int arr2[] = new int[arr1.length-3];
		int i, result;
		for (i=0; i<arr1.length-3; i++) {
			result = arr1[i]+arr1[i+1]+arr1[i+2];
			arr2[i]= result;
			}
		for (int j=0; j<arr1.length-3; j++)
		System.out.print(arr2[j]+" ");
		System.out.println();
		
		int arr3[]=new int[arr2.length];
		int k, temp;
		for (k=0; k<arr2.length; k++) {
			temp=arr2[k]-20;
			temp=Math.abs(temp);
			arr3[k]=temp;			
		}
		for (k=0; k<arr1.length-3; k++) {
			System.out.print(arr3[k]+" ");
		}
		System.out.println();
		int y, temp2=arr3[0];
			for (y=1; y<arr2.length-1; y++) {
				if (temp2>arr3[y]) {
					temp2=arr3[y];
				}
			}
			System.out.println("nearest to 20 is " + temp2);
			
			
		
		
		}
}
