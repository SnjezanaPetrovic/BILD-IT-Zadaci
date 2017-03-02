package zadaci_02_03_2013;

import java.util.Scanner;

public class Zadatak4 {
	// (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for
	// a
	// 2 * 2 system of linear equations:
	//
	// The class contains:
	// *Private data fields a , b , c , d , e , and f .
	// *A constructor with the arguments for a , b , c , d , e , and f .
	// *Six getter methods for a , b , c , d , e , and f .
	// *A method named isSolvable() that returns true if ad - bc is not 0.
	// *Methods getX() and getY() that return the solution for the equation.
	// Draw the UML diagram for the class and then implement the class. Write a
	// test
	// program that prompts the user to enter a , b , c , d , e , and f and
	// displays the result.
	// If ad - bc is 0, report that “The equation has no solution.�?

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// uzimamo vrijednosti od korisnika
			System.out.println("Unesite vrijednosti za a,b,c,d,e i f: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = input.nextDouble();
			double e = input.nextDouble();
			double f = input.nextDouble();
			// ako su vrijednosti veće od 0 i manje od 10000 pravimo objekat i
			// vrijednosti proslijedjujemo konstruktoru
			if (a > 0 && a < 10000 && b > 0 && b < 10000 && c > 0 && c < 10000 && d > 0 && d < 10000 && e > 0
					&& e < 10000 && f > 0 && f < 10000) {
				LinearEquation test = new LinearEquation(a, b, c, d, e, f);
				// ispisujemo rezultat
				if (test.isSolvable()) {
					System.out.println("x je: " + test.getX() + " a Y je: " + test.getY());
				} else {
					System.out.println("Jednacina nema rjesenje");
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
