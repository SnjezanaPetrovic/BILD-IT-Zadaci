package zadaci_02_03_2013;

import java.util.Scanner;

public class Zadatak5 {
	// (Geometry: intersecting point) Suppose two line segments intersect. The
	// two end-
	// points for the first line segment are ( x1 , y1 ) and ( x2 , y2 ) and for
	// the second line
	// segment are ( x3 , y3 ) and ( x4 , y4 ). Write a program that prompts the
	// user to enter
	// these four endpoints and displays the intersecting point. As discussed in
	// Program-
	// ming Exercise 3.25, the intersecting point can be found by solving a
	// linear equa-
	// tion. Use the LinearEquation class in Programming Exercise 9.11 to solve
	// this
	// equation

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Unesite vrijednosti za x1,x2,x3,x4,y1,y2,y3,y4; ");
			double x1 = input.nextDouble();
			double x2 = input.nextDouble();
			double x3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y1 = input.nextDouble();
			double y2 = input.nextDouble();
			double y3 = input.nextDouble();
			double y4 = input.nextDouble();
			// ako su vrijednosti veće od 0 i manje od 10000 pravimo objekat i
			// vrijednosti proslijedjujemo konstruktoru
			if (x1 > 0 && x1 < 10000 && x2 > 0 && x2 < 10000 && x3 > 0 && x3 < 10000 && x4 > 0 && x4 < 10000 && y1 > 0
					&& y1 < 10000 && y2 > 0 && y2 < 10000 && y3 > 0 && y3 < 10000 && y4 > 0 && y4 < 10000) {

				IntersectingPoint point = new IntersectingPoint(x1, x2, x3, x4, y1, y2, y3, y4);

				// ispisujemo rezultat
				if (point.isParalele()) {
					System.out.println("Prave su paralelne.");
				} else {
					System.out.println("Prave se sjeku u ta�?kama " + point.getX() + " i " + point.getY());
				}
			} else {
				System.out.println("Molimo unesite brojeve veće od 0 i manje od 10000");
			}
		} catch (Exception ex) {
			System.out.println("Pogrešan unos.Molimo unesite brojeve.");
		}
		input.close();

	}

}
