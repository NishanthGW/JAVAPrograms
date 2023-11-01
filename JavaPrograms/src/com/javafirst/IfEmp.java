package com.javafirst;

import java.util.Scanner;

public class IfEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////net salary and Bonus amount has to find automatically by the experience
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Employee Name : ");
		String name = obj.nextLine();
		
		System.out.println("Department : ");
		String Dep = obj.nextLine();
		
		System.out.println("Designation : ");
		String Des = obj.nextLine();
		
		System.out.println("Year of experience : ");
		double yoe = obj.nextDouble();
		
		System.out.println("Basic Salary : ");
		double bs = obj.nextDouble();
		
		System.out.println("DA : ");
		double da = obj.nextDouble();
		
		System.out.println("PF : ");
		double pf = obj.nextDouble();
		
		System.out.println("Employer Name: " + name);
		System.out.println("Department : " + Dep);
		System.out.println("Designation : " + Des);
		System.out.println("Year of experience : " + yoe);
		System.out.println("Basic Salary : " + bs);
		System.out.println("DA : " + da);
		System.out.println("PF amount : " + pf);
		
		double y1 = 5000;
		double y2 = 10000;
		double y3 = 15000;
		double y4 = 20000;
		
		if (yoe < 1)
		{
			System.out.println("Bonus : " + y1);
			System.out.println("Net Salary for Month = " + ((bs+da+y1)-pf));
		}
		
		else if (yoe >= 1 && yoe <3)
		{
			System.out.println("Bonus : " + y2);
			System.out.println("Net Salary for Month = " + ((bs+da+y2)-pf));
		}
		
		else if (yoe >= 3 && yoe < 5)
		{
			System.out.println("Bonus : " + y3);
			System.out.println("Net Salary for Month = " + ((bs+da+y3)-pf));
		}		
		else if (yoe >= 5)
		{
			System.out.println("Bonus : " + y4);
			System.out.println("Net Salary for Month = " + ((bs+da+y4)-pf));
		}
		
		else
		{
			System.out.println("Please Eneter the valid data in Year of experience field");
		}
		
		obj.close();

	}

}
