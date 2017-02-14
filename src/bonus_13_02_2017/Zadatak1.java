package bonus_13_02_2017;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite prvi broj: ");
			double num1 = input.nextDouble();
			System.out.println("Unesite operaciju (+,-,*,/,%,s(stepen),k (X k n - n-ti korjen iz X)");
			String operator = input.next();
			System.out.println("Unesite drugi broj: ");
			double num2 = input.nextDouble();
			System.out.println(num1 + " " + operator + " " + num2 + " = " + formula(num1, num2, operator));

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
		}

		input.close();
	}

	public static double formula(double num1, double num2, String operator) {

		double result = 0;

		if (operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("%")) {
			result = num1 % num2;
		} else if (operator.equals("s")) {
			result = Math.pow(num1, num2);
		} else if (operator.equals("k")) {
			result = Math.pow(num1, 1 / num2);
		} else {
			System.out.println("Pogrešan operator.");
		}

		return result;

	}

}
