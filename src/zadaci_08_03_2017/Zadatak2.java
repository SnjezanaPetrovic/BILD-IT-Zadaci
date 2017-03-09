package zadaci_08_03_2017;

import java.util.ArrayList;

public class Zadatak2 {
	// (Sort ArrayList) Write the following method that sorts an ArrayList of
	// numbers:
	// public static void sort(ArrayList<Integer> list)
	// Write a test program that prompts the user to enter 5 numbers, stores
	// them in an
	// array list, and displays them in increasing order.

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			int num = (int) (1 + Math.random() * 100);
			list.add(num);

		}
		System.out.println("List: \n" + list);
		System.out.println("Sorted list: ");
		sort(list);

	}

	public static void sort(ArrayList<Integer> list) {

		java.util.Collections.sort(list);
		System.out.println(list);
	}

}
