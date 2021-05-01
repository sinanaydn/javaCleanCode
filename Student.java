package workHard;

public class Student extends User{
	String level;

	
	public Student(int id, String firstName, String lastName, String password, String level) {
		super(id, firstName, lastName, password);
		this.level = level;
	}

	

	
}
