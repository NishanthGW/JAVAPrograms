package basicsJAVA;

public class Splitingstringusingdelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Direct method
		String str4 = "Hello,This,Is,My,First,Program";
		String delimeter = ",";
		String[] result = str4.split(delimeter);
		for(String word:result){
		System.out.println(word);
		}
//		System.out.println(result[3]);

		//by creating method
		String str1 = "Hello,This,Is,My,First,Program";
		CommaDelimiter(str1);
		
		String str2 = "Hello	ThisIs	My	First	Program";
		TabDelimiter(str2);
		
		String str3 = "Hello|This|Is|My|First|Program";
		PipilineDelimiter(str3);
		
	}
	private static void PipilineDelimiter(String str3) {
		// TODO Auto-generated method stub
		System.out.println("String = "+str3);
		String PLDelimiter = "\\|"; //As we know that pipe(|) is also used in conditions like OR (||) 
									//so that is a special symbol and needs to be escaped.
		String[] result3 = str3.split(PLDelimiter);
		for(String word3:result3) {
			System.out.println(word3);
		}
		System.out.println();
	}
		
	private static void TabDelimiter(String str2) {
		// TODO Auto-generated method stub
		System.out.println("String = "+str2);
		String TabDelimiter = "\t";
		String[] result2 = str2.split(TabDelimiter);
		for(String word2:result2) {
		System.out.println(word2);
}
		System.out.println();
	}

	private static void CommaDelimiter(String str1) {
		// TODO Auto-generated method stub
		System.out.println("String = "+str1);
		if(str1==null||str1.isEmpty()) {
			System.out.println("Please enter the valid data");
		}
		else {
			String CommaDelimiter=",";
			String[] result1 = str1.split(CommaDelimiter);
			for(String word1:result1) {
				System.out.println(word1);
			}
		}
		System.out.println();
	}

}
