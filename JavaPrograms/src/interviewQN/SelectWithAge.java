package interviewQN;

import java.util.Scanner;

public class SelectWithAge {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				//Name of candidates : b,c,d,e,f;
				//Their Ages : 18,24,66,33,45,40;
				//Selected Candidates : b d f
		Scanner scn = new Scanner(System.in)) {
			System.out.print("Number of candidates : ");
			int n = scn.nextInt();
			System.out.println();
			
			int i,j;
			
			System.out.println("Enter the Name of candidates : ");		
			String name[]= new String[n];
			for (i=0;i<n;i++) {
				name[i]=scn.nextLine();
			}
			System.out.println();
			
			int g,h,k;
			
			System.out.println("Enter the Ages of each Member : ");
			int age[]=new int[n];
			for (g=0; g<n; g++) {
				age[g]=scn.nextInt();
			}
			System.out.println();
			scn.close();
			System.out.print("Name of each candidates : ");
			for (j=0;j<n;j++) {
				System.out.print(name[j]+" ");
			}
			System.out.println();
			
			System.out.print("Ages of each Member : ");
			for (k=0;k<n;k++) {
				System.out.print(age[k]+" ");
			}
			System.out.println();
			
			System.out.print("Selected Candidates : ");
			for (h=0; h<n; h++) {
				if (age[h]>=20 && age[h]<=40)
				System.out.print(name[h]+" ");
			}
		}
	}
}
