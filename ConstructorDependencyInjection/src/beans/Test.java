package beans;

public class Test {

	private String name;
	private int age;
//	 public Test() { System.out.println("Default constructor "); }
	
	public Test(String name) {
		this.name = name;
	}
	
	public Test( int age) {
		 this.age = age; }

	
	 public Test(String name , int age) {
		 this.name = name;
		 this.age = age; }
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printData() {
		System.out.println("name " + name);
		System.out.println("Age " + age);

	}
}
