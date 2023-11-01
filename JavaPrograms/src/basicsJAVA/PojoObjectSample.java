package basicsJAVA;

public class PojoObjectSample {

	public static void main(String[] args) {
		
		PojoClassSample pojo = new PojoClassSample();
		
		pojo.setName("Sathish");
		pojo.setId("10256");
		pojo.setSalary(350000);
		
		System.out.println("Name : "+pojo.getName());
		System.out.println("Id : "+pojo.getId());
		System.out.println("Salary : "+pojo.getSalary());
		System.out.println();
		
		pojo.setRed("Red");
		pojo.setGreen("Green");
		pojo.setYellow("Yellow");
		
		System.out.println("light : "+pojo.getRed());
		System.out.println("light : "+pojo.getGreen());
		System.out.println("light : "+pojo.getYellow());

	}

}
