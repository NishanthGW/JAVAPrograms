package basicsJAVA;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("serial")
		class customException extends Exception
		{
			public customException(String str){
				super(str);
			}
		}
		int a = 19;
		int b = 0;
		try {
			b=18/a;
			if (b==0) {
				throw new customException("Its not possible");
			}
		}
		catch (customException e) {
			b=1;
			System.out.println("Which is less than zero "+ e);
			System.out.println("Default Value : "+b);
		}
		System.out.println(b);
		System.out.println("Bye");
	}

}
