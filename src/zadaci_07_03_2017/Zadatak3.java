package zadaci_07_03_2017;

import java.util.ArrayList;

public class Zadatak3 {
	// (Maximum element in ArrayList) Write the following method that returns
	// the
	// maximum value in an ArrayList of integers. The method returns null if the
	// list is null or the list size is 0.
	// public static Integer max(ArrayList<Integer> list)
	// Write a test program that prompts the user to enter a sequence of numbers
	// ending
	// with 0, and invokes this method to return the largest number in the
	// input.

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = (int) (1 + Math.random() * 20);
			list.add(num);

		}
		System.out.println("List: \n" + list);
		System.out.println("Max value in list is: " + max(list));

	}

	public static Integer max(ArrayList<Integer> list) {

		return java.util.Collections.max(list);

	}

}
