package com.assignments;

import java.util.Scanner;

public class Array_Leftrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Left Array
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.print("Enter Original Array : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the value      : ");
		int value = obj.nextInt();

		obj.close();
		
		int i,j,temp = 0;
		for (i=0; i<value; i++) {
			temp = arr[0];
			for (j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.print("After left rotated   : ");
		for (i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
}
		

	


