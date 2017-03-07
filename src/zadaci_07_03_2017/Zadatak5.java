package zadaci_07_03_2017;

import java.util.ArrayList;

public class Zadatak5 {
	// (Shuffle ArrayList) Write the following method that shuffles the elements
	// in
	// an ArrayList of integers.
	// public static void shuffle(ArrayList<Integer> list)

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		// uzeti cemo da je u listi 10 brojeva i to poredanih od 1 do 10
		for (int i = 1; i <= 10; i++) {
			list.add(i);

		}
		System.out.println("List: \n" + list);
		System.out.println("Shuffeled list: ");
		shuffle(list);

	}

	public static void shuffle(ArrayList<Integer> list) {

		java.util.Collections.shuffle(list);
		System.out.println(list);
	}

}
