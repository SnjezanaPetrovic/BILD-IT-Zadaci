package zadaci_07_03_2017;

public class GeometricObject {
	
	
	private String color = "white";
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public java.util.Date getDate(){
		return dateCreated;
	}

}
