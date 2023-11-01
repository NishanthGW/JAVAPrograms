package com.Oops;

/*
 How many ways we can initialize the value of class variables

1) Using Objects (directly)
2) Using Constructor
3) Using Method
 */

public class OopsPractice 
{
	int empid;
	String name;
	String desig;
	int salary;
	
	// Method One : Using Objects
	void display()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(desig);
		System.out.println(salary);
	}
	
	// Method Two : Using Constructor(refer JAVA word doc)
//	OopsPractice(int id, String nm, String Des, int sal)
//	{
//		empid=id;
//		name=nm;
//		desig=Des;
//		salary=sal;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method One - 
		OopsPractice obj1 = new OopsPractice();
		/*here, 
		 OopsPractice = class name;
		 obj1 = reference variable of object;
		 OopsPractice() = Instantiation;*/
		
		obj1.empid=0001;
		obj1.name="Sabari";
		obj1.desig="Associate";
		obj1.salary=350000;
		
		obj1.display();
		
//		OopsPractice onj2 = new OopsPractice(0002,"Riyas","Associate",250000);
//		onj2.display();
		
	}
	}

