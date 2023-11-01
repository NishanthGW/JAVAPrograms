package interviewQN;

public class DuplicateStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "goodmorning";
		String s2 = "haveagreatday";
		int i,j;
		for(i=0;i<s1.length();i++) {
			for(j=0;j<s2.length();j++) {
				if(s1.charAt(i)==(s2.charAt(j))) {
					System.out.print(s2.charAt(j)+", ");
				}
			}
		}
		

		String str1 = "Happy Christmas";
		String str = str1.toLowerCase();
		System.out.println(str);
		System.out.println();

		int x,y;
		for (x=0; x<str.length(); x++) {
			for (y=i+1; y<str.length(); y++) {
				if (str.charAt(x)==str.charAt(y)) {
					System.out.print(str.charAt(y)+" ");
				}
			}
		}

		
	}
}
