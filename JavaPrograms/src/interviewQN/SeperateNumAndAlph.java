package interviewQN;

public class SeperateNumAndAlph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "123as@d4gh5r89g2r5l6";
		System.out.println(input);
		System.out.println();
		System.out.println(input.replaceAll("[0-9]", "")); //without numbers
		System.out.println(input.replaceAll("[^0-9]", "")); //number alone
		System.out.println();
		System.out.println(input.replaceAll("[a-z]", "")); //without alphabets
		System.out.println(input.replaceAll("[^a-z]", "")); //alphabets alone
		System.out.println();
		
		String str = "01godwin@1995";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[^0-9]", ""));
		System.out.println(str.replaceAll("[a-z]", ""));

	}

}
