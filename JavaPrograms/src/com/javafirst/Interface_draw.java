package com.javafirst;

class rect implements Interfacenew
{
	public void draw()//we are taking from another one thats why we are using "public".
	{
		System.out.println("Rectangle Drawing");
	}
}

class circle implements Interfacenew
{
	public void draw()
	{
		System.out.println("Circle Drawing");
	}
}
//we can use a main class also
public class Interface_draw {
	public void draw()
	{
		System.out.println("Main class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect r = new rect();
		r.draw();
		
		circle c = new circle();
		c.draw();
		
		Interface_draw id = new Interface_draw();
		id.draw();

	}

}
