import com.javafirst.JustASample;
public class JustClass {
	public static void main(String[] args) {
		JustASample obj = new JustASample();
		System.out.println(obj.x);	//non static method so object needs to be created
		System.out.println(JustASample.y);	//static method so no need to create an object, just access through class name
		JustASample.method();
	}
	
}
