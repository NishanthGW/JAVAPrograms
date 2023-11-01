package basicsJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortingReversesorting {

	public static void main(String[] args) {
		//Sorting an Array list
		List<String> li1 = new ArrayList<String>();
		li1.add("siva");
		li1.add("arun");
		li1.add("zara");
		li1.add("raju");
		li1.add("sita");
		li1.add("gokul");
		System.out.println("Before sorting : "+li1);
		Collections.sort(li1);
		System.out.println("After sorting : "+li1);
		
		System.out.println();
		
		//Reverse Sorting an Array list
		ArrayList<String> li2 = new ArrayList<String>();
		li2.add("sss");
		li2.add("aaa");
		li2.add("ccc");
		li2.add("xxx");
		li2.add("fff");
		li2.add("lll");
		li2.add("mmm");
		System.out.println("Before sorting : "+li2);
		Collections.sort(li2);
		System.out.println("After sorting : "+li2);
		Collections.sort(li2, Collections.reverseOrder());
		System.out.println("After reverse sorting : "+li2);
	}

}
