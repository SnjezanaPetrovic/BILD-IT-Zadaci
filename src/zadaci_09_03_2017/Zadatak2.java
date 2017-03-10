package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
	// (Algebra: perfect square) Write a program that prompts the user to enter
	// an integer
	// m and find the smallest integer n such that m * n is a perfect square.
	// (Hint:
	// Store all smallest factors of m into an array list. n is the product of
	// the factors that
	// appear an odd number of times in the array list. For example, consider m
	// = 90,
	// store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd
	// number of times
	// in the array list. So, n is 10.)

	public static void main(String[] args) {
		System.out.print("Enter integer m: ");
		Scanner input = new Scanner(System.in);
		try {
			int m = input.nextInt();
			if (m >= 1 && m < 2000000000) {
				ArrayList<Integer> factors = new ArrayList<>();
				getFactors(m, factors);
				int smallestSquare = smallestSquare(factors);
				System.out.println("Smallest integer n such that m * n is a perfect square is: " + smallestSquare);
				System.out.println("m * n = " + (m * smallestSquare));

			} else {
				System.out.println("Please enter number bigger than 0 and smaller than 2000000000.");
			}
		} catch (Exception e) {
			System.out.println("Invalid input.Please enter integer.");
		}
		input.close();

	}

	private static void getFactors(int m, ArrayList<Integer> factors) {

		int count = 2;
		while (count <= m) {
			if (m % count == 0) {
				factors.add(count);
				m /= count;
			} else {
				count++;
			}
		}
	}

	private static int[][] copy(ArrayList<Integer> factors) {

		int[][] temp = new int[factors.size()][2];

		for (int i = 0; i < temp.length; i++) {
			temp[i][0] = factors.get(i);
		}
		return temp;
	}

	private static int smallestSquare(ArrayList<Integer> factors) {

		int[][] occurrences = copy(factors);
		for (int i : factors) {
			search(occurrences, i);
		}

		ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

		int smallestSquare = 1;
		for (int i : oddSequenceFactors) {
			smallestSquare *= i;
		}
		return smallestSquare;
	}

	private static void search(int[][] m, int number) {
		for (int i = 0; i < m.length; i++) {
			if (m[i][0] == number) {
				m[i][1]++;
			}
		}
	}

	private static ArrayList<Integer> removeDuplicates(int[][] m) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < m.length; i++) {
			if (m[i][1] % 2 != 0) {
				temp.add(m[i][0]);
			}
		}

		ArrayList<Integer> duplicateRemoved = new ArrayList<>();
		for (int i = 0; i < temp.size(); i++) {

			if (!duplicateRemoved.contains(temp.get(i))) {
				duplicateRemoved.add(temp.get(i));
			}
		}

		return duplicateRemoved;
	}

}
