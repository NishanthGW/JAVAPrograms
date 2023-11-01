package basicsJAVA;

public class EnumJAVA {
	
	enum level{
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) {
		level enm = level.HIGH;
		System.out.println(enm);

		switch(enm) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }
	}

}
