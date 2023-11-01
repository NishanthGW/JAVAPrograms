package interviewQN;

import java.util.Scanner;

public class HeightsOrder {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in)) {
			System.out.print("Number of Heights to be Ordered : ");
			int n = scn.nextInt();
			System.out.println("Number of Heights to be Ordered : "+n);
			
			//{166,152,170,132,168,140};
			int ht[]= new int[n];
			int i,j,g,h,dum;
			System.out.println("Enter Height of each members");
			for (i=0; i<n; i++) {
				ht[i]=scn.nextInt();
			}
			System.out.print("Height of each members : ");
			for (j=0;j<n;j++) {
				System.out.print(ht[j]+" ");
			}
			System.out.println();
			
			System.out.print("Ordered Heights : ");
			for (g=0;g<n;g++) {
				for(h=g+1;h<n;h++) {
					if(ht[g]>ht[h]) {
						dum=ht[g];
						ht[g]=ht[h];
						ht[h]=dum;					
					}
				}
				System.out.print(ht[g]+" ");
			}
			scn.close();
		}
	}

}
