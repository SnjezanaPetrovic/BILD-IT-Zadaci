package zadaci_03_03_2017;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distance(MyPoint point2) {

		return distance(this, point2);
	}

	public static double distance(MyPoint point1, MyPoint point2) {

		return Math.sqrt(Math.pow(point1.x - point2.x, 2)) + Math.pow(point1.y - point2.y, 2);
	}

}
