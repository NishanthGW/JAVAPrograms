package com.javafirst;

import java.util.*;

public class List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array List - String
		
		//Adding Elements in list
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("Mango");
		List1.add("Jackfruit");
		List1.add("Banana");
		List1.add("Apple");
		List1.add("Orange");
		List1.add("Strawberry");
		
		Iterator<String> iter = List1.iterator();	//Iterator method
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		//Remove
		List1.remove(5);
		
		for (String frt : List1)
			System.out.println(frt);
		System.out.println();
		
		//Get
		Scanner obj = new Scanner(System.in);
		System.out.print("Get the element in the index of ");
		int n = obj.nextInt();
		System.out.println(List1.get(n));
		obj.close();
		System.out.println();
		
		//Set
		List1.set(4, "Pomegranate");
		for (String fruits : List1)					//for each method
		System.out.println(fruits);
		System.out.println();
		
		//Sort
		System.out.println("After Sorting : ");
		Collections.sort(List1);
		for (String fruitL1 : List1)
			System.out.println(fruitL1);
		System.out.println();
		
		//Reverse Sorting
		System.out.println("After Reverse Sorting :");
		Collections.sort(List1, Collections.reverseOrder());
		for (String fruitL2 : List1)
			System.out.println(fruitL2);
		System.out.println();
		
		
		//Array List - Integer
		ArrayList<Integer> NumSeries = new ArrayList<Integer>();
		NumSeries.add(24);
		NumSeries.add(22);
		NumSeries.add(25);
		NumSeries.add(21);
		NumSeries.add(23);
		System.out.print("Before Sorting  : ");
		for (int num : NumSeries) {
			System.out.print(num+ " ");
		}
		System.out.println();
		
		//sort - integers
		Collections.sort(NumSeries);
		System.out.print("After Sorting   : ");
		for (int afsort : NumSeries) {
			System.out.print(afsort+" ");
		}
		System.out.println();
		
		System.out.print("Reverse Sorting : ");
		//Reverse Sorting
		Collections.sort(NumSeries, Collections.reverseOrder());
		for (int Revsort : NumSeries) {
			System.out.print(Revsort+" ");
		}
	}

}
