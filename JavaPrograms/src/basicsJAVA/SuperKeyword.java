package basicsJAVA;
class Car{
	Car(){
		System.out.println("Parent Constructor");
	}
	String sen1 = "Drive carefully";
	void vehicle() {
		System.out.println("Cars provide comfortable traveling");
	}
}
class maruti extends Car{
	String sen2 = "Don't Drink and Drive";
	void vehicle() {
//		super();	//used to invoke parent class constructor
		super.vehicle();	//used to invoke parent class method
		System.out.println("Maruti is one of the car brand");
		System.out.println(super.sen1);	//used to refer immediate parent class instance variable
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		maruti obj = new maruti();
		obj.vehicle();
		System.out.println(obj.sen2);
	}
}
