package day3Homeworks;

public class Instructor extends User{
	
	
	public void Instructor(String major) {
		this.major=major;
	}
	
	private String major;

	
	
	
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
