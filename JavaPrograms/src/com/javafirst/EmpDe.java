package com.javafirst;

import java.util.Scanner;

public class EmpDe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee Details
		
Scanner obj = new Scanner(System.in);
		
		System.out.println("Employer Name: ");
		String name = obj.nextLine();
		System.out.println("Department : ");
		String Dep = obj.nextLine();
		System.out.println("Designation : ");
		String Desi = obj.nextLine();
		System.out.println("Experience : ");
		double Exp = obj.nextDouble();
		System.out.println("Basic Salary : ");
		double Basic = obj.nextDouble();
		System.out.println("DA : ");
		double DAs = obj.nextDouble();
		System.out.println("PF amount : ");
		double Pf = obj.nextDouble();
		
		System.out.println("Name : " + name);
		System.out.println("Department : " + Dep);
		System.out.println("Designation = " + Desi);
		System.out.println("Experience = " + Exp);
		System.out.println("Basic Salary = " + Basic);
		System.out.println("DA = " + DAs);
		System.out.println("PF amount = " + Pf);
		System.out.println("Net Salary = " + ((Basic+DAs)-Pf));
		
		obj.close();

	}

}
