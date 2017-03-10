package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {
	// (Area of a convex polygon) A polygon is convex if it contains any line
	// segments
	// that connects two points of the polygon. Write a program that prompts the
	// user to
	// enter the number of points in a convex polygon, then enter the points
	// clockwise,
	// and display the area of the polygon.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int points = 0;
		double[] xPoints;
		double[] yPoints;

		while (true) {

			try {
				System.out.print("Enter the number of points in a convex polygon: ");
				points = input.nextInt();
				if (points >= 4 && points <= 10) {
					xPoints = new double[points];
					yPoints = new double[points];

					for (int i = 0; i < points; i++) {
						System.out.print((i + 1) + "Enter  x coordinate: ");
						xPoints[i] = input.nextDouble();
						System.out.print((i + 1) + "Enter  y coordinate: ");
						yPoints[i] = input.nextDouble();
					}
					break;

				} else {
					System.out.println("Enter number bigger than 4 and smaller than 10.Please try ahain: ");
					points = input.nextInt();
				}

			} catch (InputMismatchException ex) {
				System.out.println("Invalid input.Please try again: ");
				input.nextLine();
			}
		}

		System.out.println("\nArea is: " + Math.abs(getAreaOfConvexPolygon(xPoints, yPoints, points)));
		input.close();

	}

	public static double getAreaOfConvexPolygon(double[] x, double[] y, int points) {

		double area = 0;
		int j = points - 1;

		for (int i = 0; i < points; i++) {
			area += ((x[j] + x[i]) * (y[j] - y[i]));
			j = i;
		}
		return area / 2;
	}

}
