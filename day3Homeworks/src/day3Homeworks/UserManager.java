package day3Homeworks;

public class UserManager {
	
	
	public void Add(User user) {
		System.out.println("Sisteme eklendi" + user.getFirstname());
	}
	
	public void Remove(User user) {
		System.out.println("Sistemden i cikarildi" + user.getFirstname());
	}
	
	
}
