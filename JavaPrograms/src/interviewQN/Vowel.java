package interviewQN;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aeiou";
		String s2 = "its a wonderful day";
		int i,j;
		for(i=0;i<s1.length();i++) {
			for(j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					System.out.print(s2.charAt(j)+", ");
				}
			}
		}

	}

}
