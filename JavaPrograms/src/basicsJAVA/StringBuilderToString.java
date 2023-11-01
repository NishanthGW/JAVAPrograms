package basicsJAVA;

public class StringBuilderToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("javapractise");
		String st = sb.toString();
		System.out.println(st);
		
		String str[] = {"car","Bike","Truck","Ship"};
		int i;
		for(i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		
		StringBuilder SB = new StringBuilder();
		SB.append(str[0]+" ");
		SB.append(str[1]+" ");
		SB.append(str[2]+" ");
		SB.append(str[3]+" ");
		
		String strC = SB.toString();
		System.out.println("String = "+strC);

	}

}
