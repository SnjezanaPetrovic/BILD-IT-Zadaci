package zadaci_07_03_2017;

public class Student extends Person {

	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";

	private String status;

	public Student() {
		super();

	}

	public Student(String name, String status) {
		super(name);
		this.status = status;
	}

	public String getClassStatus() {
		return status;
	}

	public void setClassStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student name: " + getName() + "\nStatus: " + status;
	}

}
