package interviewQN;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Write a Java Program to reverse a string without using String inbuilt function.
		//StringBuilder
		
		String str = "isseM lenoeL";
		StringBuilder rts = new StringBuilder();
		rts = rts.append(str);
		rts=rts.reverse();
		System.out.println(rts);
		
		String str1 = "laeR ehT";
		char dum[]= str1.toCharArray();
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(dum[i]);
		}
		System.out.println();
		
		String str2 = "taoG";
		String rev ="";
		int i;
		for(i=str2.length()-1;i>=0;i--) {
			rev=rev+str2.charAt(i);
		}
		System.out.println(rev);
			
	}

}
