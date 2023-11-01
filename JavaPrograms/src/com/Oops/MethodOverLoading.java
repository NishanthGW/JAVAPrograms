package com.Oops;

class car8 {
	public void number() {
		int a,b;
		a=10;
		b=20;
		b=500/a;
		System.out.println(b);
	}
	public int number(int x) {
		int y=x+2;
		System.out.println(y);
		return y;
	}
	public int number(int x, int y) {
		int z = x*y;
		System.out.println(z);
		return z;
}
	public double number(double x, double y) {
		double z = x-y;
		System.out.println(z);
		return z;
}
}
class Student{
	Student(){
		System.out.println("Comstructor 1");
	}
	Student(int n){
		int s=88/n;
		System.out.println(s);
				
	}
}
public class MethodOverLoading {
	
	public static void main(String[] args) {
		car8 obj = new car8();
		obj.number(2, 5);
		obj.number(20);
		obj.number();
		obj.number(5.5, 0.8);
		@SuppressWarnings("unused")
		Student obj2 = new Student(5);
		
	}
}
