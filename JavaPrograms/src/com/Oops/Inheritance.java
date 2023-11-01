package com.Oops;

class cal{
	public int add(int a, int b) {
		int add=a+b;
		return add;
	}
	public int sub(int a, int b) {
		int sub=a-b;
		return sub;
	}	
}
class Adcal extends cal{
	public int mul(int a, int b) {
		int mul=a*b;
		return (mul);
	}
	public int div(int a, int b) {
		int div=a/b;
		return div;
	}	
}
class newAdcal extends Adcal{
	public double per(double a, double b) {
		double per=a/b*100;
		return (per);
	}
	public int rem(int a, int b) {
		int rem=a%b;
		return rem;
	}	
}
public class Inheritance extends newAdcal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newAdcal obj = new newAdcal();
		int a = obj.add(10, 3);
		int b = obj.sub(10, 3);
		int c = obj.mul(10, 3);
		int d = obj.div(10, 3);
		double e = obj.per(10, 3);
		int f = obj.rem(10, 3);
		System.out.println("Addition : "+a);
		System.out.println("Subraction : "+b);
		System.out.println("Multiplication : "+c);
		System.out.println("Divition : "+d);
		System.out.println("Remaining : "+f);
		System.out.println("Percentage : "+e+"%");
	}
}
