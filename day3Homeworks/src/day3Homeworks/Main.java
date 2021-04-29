package day3Homeworks;

public class Main {

	public static void main(String[] args) {
		
		
		
		Instructor instructor=new Instructor();
		
		instructor.setMajor("Software");
		instructor.setFirstname("Gökhan");
		
		Student student = new Student();
		student.setLanguage("java");
		student.setEmail("abcd@gmail.com");
		student.setFirstname("Engin xd");
		student.setLastname("demirog");
		
		User[] users = new User[] {instructor,student};
		
		for(User user:users) {
			System.out.println(user.getFirstname());
		}
		
		
		UserManager userManager = new UserManager();
		userManager.Add(student);
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.chooseCourse(instructor);
		studentManager.chooseCourse(student);;
		}

	}


