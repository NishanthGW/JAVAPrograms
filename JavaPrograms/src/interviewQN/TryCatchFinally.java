package interviewQN;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b = 5;
			int c = a/b;
			System.out.println("Division Value = "+c);
			System.out.println("Block 1 Executed");
			
		}
		catch(Exception E){
			System.out.println("Unable to Execute Block 1");
		}
		finally{
			int x=10;
			int y=50;
			int subraction = x-y;
			int diff = Math.abs(subraction);
			System.out.println(diff);
		System.out.println("Block 2 Executed");
		}

}
}