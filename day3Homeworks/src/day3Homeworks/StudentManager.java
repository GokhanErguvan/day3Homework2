package day3Homeworks;

public class StudentManager extends UserManager {

	public void chooseCourse(User user) {
		System.out.println("secmek istediginiz kursa t�klay�n�z"+ user.getLastname());
	}
}
