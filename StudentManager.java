package workHard;

public class StudentManager {

	public void levelUpDate(Student student) {
		System.out.println( student.level+" ilerleme kaydetmi�tir.");
	}

		public void levelUpDate1(Student[] students) {
			for (Student student : students) {
				levelUpDate(student);
			}
		}
}
