package basicsJAVA;

public class TypeConversionCasting {

	public static void main(String[] args) {

//		What is meant by type conversion and type casting in Java? 
//				In type conversion, a compiler converts a lower data type into a higher data type. 
//				In type casting, a higher data type is converted into a lower data type by the programmer.
		
//		byte --> short --> int --> long --> float --> double
		

		// TODO Auto-generated method stub
		
//		int x; 	//Declaration
//		x=10;	//Initialization
//		x=variable; 10=constant value;

		//Primitive Data type
		
		short s = 25;
		int i = s;
		System.out.println("short to int = "+i); //implicit or type conversion
		
		float f = 20.45f;
		double d = f;
		System.out.println("float to double = "+d); //implicit or type conversion
		
		long l = 5466;
		short ss = (short)l;
		System.out.println("long to short = "+ss); //Explicit or type casting
		
		char c = 'B';
		int ii = c;
		System.out.println("char to int = "+ii); //implicit or type conversion
		System.out.println();
		
		String stri = "false";
		boolean boo = Boolean.parseBoolean(stri);
		System.out.println(boo);
		
		System.out.println("String to integer");
		
		String str = "789456";
		
		int num1 = Integer.parseInt(str);
		System.out.println("By Integer.parseInt() method : "+num1); //Explicit or type casting
		
		int num2 = Integer.valueOf(str);
		System.out.println("By Integer.valueOf() method : "+num2); //Explicit or type casting
		
		@SuppressWarnings("removal") //this line isn't mandatory one
		int num3 = new Integer(str).intValue();
		System.out.println("By new Integer(str) method : "+num3); //Explicit or type casting

		System.out.println();		
		
		byte x = 10;
		byte y = 20;
		int z = x*y;		
		System.out.println(z);//Implicit 

		//byte b = 127; //Max value can store in a byte is 127;
		int a = 18;
		byte bt =(byte)a; //Type casting
		System.out.println(bt);//Explicit	
		
		float ft = 5.6f;
//		int t = ft;
		int n = (int)ft;
		System.out.println(n);//Explicit	
		
		char ch = 'A';
		int m = 65;
//		char ch =m;
		ch = (char)m;
		System.out.println(ch);
		
		int e = 123;
		long lg = 888;
//		float fl = e+lg;				//Implicit
		float fl = (float)(e+lg);	//Explicit
		System.out.println(fl);
		
System.out.println("=======================================================");
		
		//Wrapper Class

		Short sss = 2578;
		Integer iii = sss.intValue();
		System.out.println(iii);
		
		Float fff = 20.45f;
		Double ddd = fff.doubleValue();
		System.out.println(ddd);
		
		Long lll = 5466l;
		Short ssss = lll.shortValue();
		System.out.println(ssss);
		
		@SuppressWarnings("unused")
		Character ccc = 'B';
		Integer iiii=Character.getNumericValue(c);
		System.out.println("char to int = "+iiii); 
		
		String strin = "false";
		Boolean booo = Boolean.valueOf(strin);
		Boolean bo = Boolean.parseBoolean(strin);
		System.out.println(booo);
		System.out.println(bo);
	}

}
