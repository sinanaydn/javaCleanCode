package workHard;

public class Main {

	public static void main(String[] args) {

		
		Student student1 = new Student(1,"sinan","Aydın","23423", "%80");
		Student student2 = new Student(2,"srnasd","Aydın","23423", "%90");
		
		StudentManager studentManager= new StudentManager();
		Student[] students= {student1,student2};
		studentManager.levelUpDate1(students);
		
		
		
		Instructor instructor=new Instructor(1, "Engin ", "Demiroğ ", "23423434", "java");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.join(instructor);
		
		UserManager userManager=new UserManager();
		userManager.join(student2);
		userManager.logout(student1);
		
		
		

		
		
		

		
		

	}

}
