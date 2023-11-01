package basicsJAVA;

import java.util.ArrayList;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"aaa","bbb","ccc","ddd"};
		
		List<String> li = new ArrayList<String>();
		
		for(String w:a) {
			li.add(w);
		}
		System.out.println(li);

	}

}
