package interviewQN;

public class Which3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,5,3,8,9,6,4,2};
		int i,j,k,dum,val,a=0,b=0,c=0;
		int ck=10;
		for (i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				for(k=j+1;k<arr.length;k++) {
					dum=arr[i]+arr[j]+arr[k];
					val=Math.abs(20-dum);
					if (val<ck) {
						ck=val;
						val=0;
						a=arr[i];
						b=arr[j];
						c=arr[k];
					}
				}
			}
		}
		System.out.println(ck);
		System.out.println(a+", "+b+", "+c);
	}

}
