package basicsJAVA;

class sky{
	int j;

	void sun() {
		System.out.print("Non static method : ");
		System.out.println("sun is so hot");
	}
	
	static int i;
	static String a="Have fun";
	
	static void moon() {
		System.out.print("Static Method : ");
		System.out.println("moon is beautiful;");
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		sky obj = new sky();
		obj.j=10;
		System.out.println("Non Static variable : "+obj.j);
		obj.sun();
		System.out.println();
		
		sky.i=20;
		System.out.println("Static variable : "+sky.i);
		sky.moon();
	}

}
