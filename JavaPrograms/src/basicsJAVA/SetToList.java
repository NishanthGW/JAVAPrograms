package basicsJAVA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st = new HashSet<Integer>();
		st.add(235);
		st.add(123);
		st.add(923);
		st.add(479);
		st.add(333);
		System.out.println("Set : "+st);

		List<Integer> Al = new ArrayList<Integer>(st);
		System.out.println("List : "+Al);
		
	}

}
