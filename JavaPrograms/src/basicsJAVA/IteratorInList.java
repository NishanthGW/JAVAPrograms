package basicsJAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("car");
		list.add("Bike");
		list.add("Train");
		list.add("Ship");
		list.add("Truck");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
//			String item = it.next();
//			System.out.println(item);
			System.out.println(it.next());
		}

	}

}
