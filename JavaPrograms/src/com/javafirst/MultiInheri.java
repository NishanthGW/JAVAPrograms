package com.javafirst;

class Solarsystem{
	void Milkyway() {
		System.out.println("Milkyway is huge");
	}
}

class Planets extends Solarsystem{
	void Earth() {
		System.out.println("Our Planet");
	}
}

class Country extends Planets{
	void India() {
		System.out.println("Our Country");
	}
}

public class MultiInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country plc = new Country();
		plc.India();
		plc.Earth();
		plc.Milkyway();
	}

}
