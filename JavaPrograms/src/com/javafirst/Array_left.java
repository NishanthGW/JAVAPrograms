package com.javafirst;

public class Array_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,22,50,20,100};
		int max,i;
		max = arr[0];
		for (i=0;i<arr.length; i++) 
			if (arr[i]>max)
				max = arr[i];
		System.out.println(max);
	}
}
