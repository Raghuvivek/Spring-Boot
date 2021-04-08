package beans;

public class Test {
	
	private String name;
	private int age;
	private String email;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printData() {
		System.out.println("name " + name);
		System.out.println("age " + age);
		System.out.println("email " + email);
	}
}
