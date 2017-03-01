package zadaci_28_02_2017;

public class Location {
	public int row, column;
	public double maxValue;

	public Location() {

	}

	public Location(int row, int column) {
		super();
		this.row = row;
		this.column = column;

	}

	public static Location locateLargest(double[][] matrix) {
		Location location = new Location();
		location.maxValue = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] > location.maxValue) {
					location.maxValue = matrix[row][column];
					location.row = row;
					location.column = column;

				}

			}

		}
		return location;
	}

}
