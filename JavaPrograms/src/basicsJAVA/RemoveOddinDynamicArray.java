package basicsJAVA;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddinDynamicArray {
		
		public static void main(String[] args) {
				
			List<Integer> list = new ArrayList<Integer>();
			int i = 1;
			while(i<100) {
				list.add(i);
				i++;
			}
			System.out.println("list values : ");
			for(int h:list) {
				System.out.println(h);
			}
			System.out.println("----------------------------------------------------");

	System.out.println("After removed odd numbers : ");
			for (int j=0;j<50;j++) {
				if (list.get(j)%2==1) {
					list.remove(j);
				}
			}
			for(int h:list) {
				System.out.println(h);
			}
			System.out.println("----------------------------------------------------");
		}
	}
//			int j=0;
//			while(j<50) {
//				if (list.get(j)%2!=0) {
//					System.out.println(list.get(j));
//					list.remove(j);
//					j=j+1;
//				}
//			}
//			for(int o:list) {
//				if (o%2==1) {
//					list.remove(o);
//				}
//			}
				
	//
//			for(int h:list) {
//				System.out.println(h);
//			}
//			System.out.println("----------------------------------------------------");
				
//			for(int y:list) {
//				if(y%2!=0) {
//					System.out.println(y);
//					list.remove("y");
//				}
				
//				int r=list.get(2);
//				System.out.println(r);
//				System.out.println("----------------------------------------------------");
	//
//			for(int x:list) {
//					System.out.println(x);
//				}
//			}
//			list.remove(i);
//			for(int j=0; j<100; j++) {
//				if(list.contains(list)) {
//					
//				}
//			}
//			}	
	//}

//	}
//
//}
