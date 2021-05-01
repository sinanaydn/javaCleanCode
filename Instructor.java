package workHard;

public class Instructor extends User{
	String training;

	public Instructor(int id, String firstName, String lastName, String password, String training) {
		super(id, firstName, lastName, password);
		this.training = training;
	}
}
