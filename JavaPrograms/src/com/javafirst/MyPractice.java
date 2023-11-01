package com.javafirst;

import java.util.ArrayList;
import java.util.List;
public class MyPractice {
	
	public void stu() {
		String nam = "king";
//		int num = 123456;
		System.out.println(nam);
	}
	
	public void List() {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("hari");
		list1.add("Bala");
		list1.add("Guna");
		list1.add("Mani");
		list1.add("120");
		
		for (String s:list1) {
			System.out.println(s.replaceAll("[^0-9]", ""));
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPractice ob1 = new MyPractice();
		ob1.stu();
		System.out.println();
		ob1.List();
		}
}
