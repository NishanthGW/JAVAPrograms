package basicsJAVA;

//import java.util.ArrayList;
//import java.util.List;

public class PojoClassSample {
//	POJO(Plain Old JAVA Object)
//	1. Can't Extend anything(any other class, like child class)
//	2. Can't Implement anything(any interfaces)
//	3. No outside annotations(libraries, classes)
	
	private String name;
	private String id;
	private double salary;
	
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}	
	
	private String red;	
	private String green;
	private String yellow;
	
	public String getRed() {
		return red;		
	}
	public void setRed(String red) {
		this.red=red;
	}
	
	public String getGreen() {
		return green;
	}
	public void setGreen(String green) {
		this.green=green;
	}

	public String getYellow() {
		return yellow;
	}
	public void setYellow(String yellow) {
		this.yellow=yellow;
	}
	
//	List<Integer> Dlist = new ArrayList<Integer>();
//	int size = Dlist.size();
//	for(int i=0; i<1000; i++) {
//		Dlist.set(size, i);
//	}
}
