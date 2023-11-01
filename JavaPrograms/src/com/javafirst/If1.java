package com.javafirst;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find the grade for student's mark
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Tamil = ");
		int tamil = obj.nextInt();
		
		System.out.println("English = ");
		int english = obj.nextInt();
		
		System.out.println("Maths = ");
		int maths = obj.nextInt();
		
		System.out.println("Science = ");
		int science = obj.nextInt();
		
		System.out.println("Social = ");
		int social = obj.nextInt();
		
		double avg = (tamil+english+maths+science+social)/5;
		System.out.println("Average Mark = " + avg);
		
		
		if (tamil < 35 || english < 35 ||maths < 35 || science < 35 || social < 35)
		{
			System.out.println("Fail");
		}
		
		else if (avg >= 35 && avg < 50)
		{
			System.out.println("B grade");
		}
		
		else if (avg >= 50 && avg <75)
		{
			System.out.println("B+ Grade");
		}
		
		else if (avg >= 75 && avg <95)
		{
			System.out.println("A Grade");
		}
		
		else if (avg >= 95 && avg <= 100)
		{
			System.out.println("A+ Grade");
		}
		
		else
		{
			System.out.println("Invalid data");
		}
		
		obj.close();
	}

}
