package day3Homeworks;

public class Student extends  User {
	
	
	
	
	public void Student(String language,int id) {
		this.language=language;
		this.id=id;
	}
	
	
	
	
	
	
	private String language;
	private int id;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
