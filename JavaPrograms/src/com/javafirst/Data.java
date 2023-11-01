package com.javafirst;

public class Data {

	//Global Declaration
	 static char z = 'A';
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Local Declaration
		
		//change to Upper case, Lower case
		//find the Length
		//Max value, Min value,SquareRoot
		//negative to positive number
		//To get a random number
		
		int num=100;
		String name = "Nataraj";
		Float f = 10.5656f;
		Double d = 105.5656565656d;
		
		System.out.println("Name of the candidate: " + name);
		System.out.println("value of one item:" + f);
		System.out.println("Value of g item" + d);
		System.out.println(num);
		
		int a,b,c;
		a=15;
		b=20;
		c=100;
		

		String s1="Hai";
		String s2="JAVA EXAMPLES";
		
		System.out.println("Change to Uppercase : " + s1.toUpperCase());
		System.out.println("Change to Lower : " + s2.toLowerCase());
		System.out.println("Length of s1 is " + s1.length());
		System.out.println("index of EXAM = " + s2.indexOf("EXAM"));
		
		System.out.println("Maximum value : " + Math.max(a, b));
		System.out.println("Minimum Value : " + Math.min(a, b));
		System.out.println("Squareroot of c = " + Math.sqrt(c));
		
		System.out.println(Math.abs(-2.2));
		
		int randomNum = (int)(Math.random()*11);
		System.out.println(randomNum);
		
		
		

	}

}
