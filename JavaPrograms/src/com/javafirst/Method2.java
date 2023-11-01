package com.javafirst;

public class Method2 {
	
public int addnum(int a, int b)
{
int sum = a+b;
return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method2 ob = new Method2();
		int result = ob.addnum(100, 100);
		System.out.println(result);

	}

}
