package com.javafirst;

import java.util.Scanner;

public class Array_closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,4,6,8,10,15,17,19,25};
		int temp;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a number");
		int input=get.nextInt();
		
		int minSum=Math.abs ((array[0]+array[1]+array[2])-input);
		int firstVariable=1;
		int secondVariable=2;
		int thirdVariable=4;
		for (int i=0;i<array.length-2; i++) {
			for (int j=i+1;j<array.length-1;j++) {
				for (int k=j+1; k<array.length; k++) {
					temp=Math.abs ((array[i]+array[j]+array[k])-input);
					if(temp<minSum){
						firstVariable=array[i];
						thirdVariable=array[k];
						secondVariable=array[j];
						minSum=temp;
					}
				}
			}
		}
		System.out.println("The difference between the closeset sum is "+minSum);
		System.out.print (firstVariable+" ");
		System.out.print(secondVariable+" ");
		System.out.print(thirdVariable);
		get.close();

	}

}
