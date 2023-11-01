package com.Oops;

public class Sample {
	
	int no = 001;
	String name = "sive";
	String Des = "Asso";
	int sal = 350000;
	
	void detail() {
		System.out.println(no);
		System.out.println(name);
		System.out.println(Des);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.sal=450000;
		obj.detail();
	}

}
