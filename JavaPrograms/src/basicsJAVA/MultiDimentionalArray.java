package basicsJAVA;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= new int[3][4];		
		int i,j;
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				arr[i][j] = (int) (Math.random()*100);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
