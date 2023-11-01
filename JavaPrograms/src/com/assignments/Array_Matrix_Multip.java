package com.assignments;

public class Array_Matrix_Multip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{4,5}};
		int b[][]= {{3,4},{7,2}};
		int sum[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j]=0;
				for(int k=0;k<2;k++) {
					sum[i][j]+=a[i][k]*b[k][j];
				}
				System.out.println(sum[i][j]);
			}
		}

	}

}
