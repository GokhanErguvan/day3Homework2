package day3Homeworks;

public class User {
	
	public void BasePerson(String firstname, String lastname, String email, int password) {
		// System.out.println("Bu bir yapici blok");
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
		
	}
	
	
	
	
	private String firstname;
	private String lastname;
	private String email;
	private int password;
	
	
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}


	
		
	
	

