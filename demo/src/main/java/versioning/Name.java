package versioning;

public class Name {
	private String Firstname;
	private String Lastname;
	
	
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Name(String firstname, String lastname) {
		super();
		Firstname = firstname;
		Lastname = lastname;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	

}
