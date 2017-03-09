package zadaci_08_03_2017;

import java.util.ArrayList;

public class Zadatak3 {
	// (Sum ArrayList) Write the following method that returns the sum of all
	// numbers
	// in an ArrayList:
	// public static double sum(ArrayList<Double> list)
	// Write a test program that prompts the user to enter 5 numbers, stores
	// them in an
	// array list, and displays their sum.

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			double num = (1 + Math.random() * 100);
			list.add(num);

		}
		System.out.println("List: \n" + list);
		System.out.println("Sum is: " + sum(list));

	}

	public static double sum(ArrayList<Double> list) {

		double sum = 0;
		for (int i = 0; i < list.size(); i++) {

			sum += list.get(i);

		}
		return sum;
	}

}
