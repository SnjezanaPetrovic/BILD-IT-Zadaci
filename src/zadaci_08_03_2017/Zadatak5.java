package zadaci_08_03_2017;

import java.util.ArrayList;

public class Zadatak5 {
	// (Combine two lists) Write a method that returns the union of two array
	// lists of
	// integers using the following header:
	// public static ArrayList<Integer> union(
	// ArrayList<Integer> list1, ArrayList<Integer> list2)
	// For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
	// {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to
	// enter two lists,
	// each with five integers, and displays their union. The numbers are
	// separated by
	// exactly one space in the output

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		

		generateList(list1);
		System.out.print("List 1: \n"+list1);
		
		generateList(list2);
		System.out.print("\nList 2: \n"+list2);
		
		ArrayList<Integer> list3 = union(list1, list2);
		System.out.println("\nUnion of list1 and list2 is: \n"+list3);

		

	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		ArrayList<Integer> unitedList = new ArrayList<>();
		unitedList.addAll(list1);
		unitedList.addAll(list2);

		return unitedList;
	}
	public static void generateList(ArrayList<Integer> list) {

		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 10));

		}
	}

}
