import person.*;

public class MainProg {

	public static void main(String[] args) {

		Birthday bday = new Birthday(1, 3, 1993);
		String fname = "Taufiq";
		String lname = "Gh";

		Student s1 = new Student(fname, lname, bday, 1600820, 200);

		System.out.println("No. : " + s1.getStudentCount());
		s1.setName("Mira","Kuru");
		System.out.println(s1.getIdNumber());
		System.out.println("*******************");
		s1.studentInfo();
	}
}
