package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zadatak4 {
	// (Remove duplicates) Write a method that removes the duplicate elements
	// from
	// an array list of integers using the following header:
	// public static void removeDuplicate(ArrayList<Integer> list)
	// Write a test program that prompts the user to enter 10 integers to a list
	// and displays
	// the distinct integers separated by exactly one space.

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			int num = (int) (1 + Math.random() * 10);
			list.add(num);

		}
		System.out.println("List: \n" + list);
		System.out.println("List without duplicates: ");
		removeDuplicate(list);
		

	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		System.out.print("[");
		for (Integer num : set) {
			System.out.print(num+", ");
		}
		System.out.println("]");
	}

}
