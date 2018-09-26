package person;

// import person.*;

public class Student extends Person {

	private long idNumber;
	private int level;
	private static int totalStudents = 0;

	public Student() {

		totalStudents++;
	}

	public Student(String fn, String ln, Birthday bd, long id, int lvl) {

		super(fn, ln, bd);
		this.idNumber = id;
		this.level = lvl;
		totalStudents++;
	}

	public void setLevel(int lvl) {
		this.level = lvl;
	}
	public int getLevel() {
		return level;
	}

	public void setIdNumber(long id) {
	       this.idNumber = id;
	}
	public long getIdNumber() {
		return idNumber;
	}

	public long getStudentCount() {
		return totalStudents;
	}

	public void studentInfo() {

		System.out.println(idNumber);
		personInfo();
		System.out.println(level);
	}

}
