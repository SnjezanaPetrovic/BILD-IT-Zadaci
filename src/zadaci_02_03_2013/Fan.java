package zadaci_02_03_2013;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan() {
		this.speed = 1;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	

	public Fan(int speed, boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		if (on) {
			return "Fan [speed=" + speed + ",  radius=" + radius + ", color=" + color + "]";
		}
		return "Fan[color=" + color + ", radius=" + radius + ", fan is off.]";
	}

}
