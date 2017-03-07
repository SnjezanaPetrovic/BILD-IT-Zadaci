package zadaci_07_03_2017;

public class Faculty extends Employee {

	private String officeHours;
	private String rank;

	public Faculty() {
		super();

	}

	public Faculty(String name) {
		this(name, "8AM-4PM", "Employee");
	}
	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty name: " + getName();
	}

}
