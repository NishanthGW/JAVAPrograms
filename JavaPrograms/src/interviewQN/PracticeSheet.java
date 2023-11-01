package interviewQN;

public class PracticeSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//70, 15, 20, 60, 5, 30, 40
//		int a[]= {7,5,3,8,9,6,4,2};
		int a[]= {70, 15, 20, 60, 5, 30, 40};

		int i,j,k,x,y,l=0,m=0,n=0;
		int diff=10;
		for(i=0; i<a.length; i++) {
			for(j=i+1; j<a.length; j++) {
				for(k=j+1; k<a.length; k++) {
					x=a[i]+a[j]+a[k];
					y=Math.abs(x-20);
					if (y<diff) {
						diff=y;
						y=0;
						l=a[i];
						m=a[j];
						n=a[k];

					}
				}
			}
		}
		System.out.println(diff);
		System.out.println(l+", "+m+", "+n);

	}

}
