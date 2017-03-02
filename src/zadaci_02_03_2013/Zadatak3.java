package zadaci_02_03_2013;

import java.util.Scanner;

public class Zadatak3 {
	// (Algebra: quadratic equations) Design a class named QuadraticEquation for
	// a quadratic equation ax 2 + bx + x = 0. The class contains:
	//
	// Private data fields a , b , and c that represent three coefficients.
	// A constructor for the arguments for a , b , and c .
	// Three getter methods for a , b , and c .
	// A method named getDiscriminant() that returns the discriminant, which is
	// b 2 - 4ac.
	// The methods named getRoot1() and getRoot2() for returning two roots of
	// the equation (-b+(Math.sqrt(b*b-4*a*c)))/(2*a) and
	// (-b-(Math.sqrt(b*b-4*a*c)))/(2*a)
	// These methods are useful only if the discriminant is nonnegative. Let
	// these meth-
	// ods return 0 if the discriminant is negative.
	// Draw the UML diagram for the class and then implement the class. Write a
	// test
	// program that prompts the user to enter values for a, b, and c and
	// displays the result
	// based on the discriminant. If the discriminant is positive, display the
	// two roots. If
	// the discriminant is 0, display the one root. Otherwise, display “The
	// equation has
	// no roots.�?

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// uzimamo vrijednosti od korisnika
			System.out.println("Unesite vrijednosti za a,b i c: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			input.close();
			// napravimo objekat i proslijedimo vrijednosti konstruktoru
			QuadraticEquation test = new QuadraticEquation(a, b, c);
			if (test.getDiscriminant() < 0) {
				System.out.println("The eqation has no roots.");
			} else if (test.getDiscriminant() == 0) {
				System.out.println("The eqation has one root: " + test.getRoot1());
			} else if (test.getDiscriminant() > 0) {
				System.out.println("The eqation has two roots: " + test.getRoot1() + " i " + test.getRoot2());
			}
		} catch (Exception ex) {
			System.out.println("Pogrešan unos.Molimo unesite brojeve.");
		}

	}

}
