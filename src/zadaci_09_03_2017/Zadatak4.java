package zadaci_09_03_2017;

import java.util.Scanner;

public class Zadatak4 {
	// (ArrayIndexOutOfBoundsException) Write a program that meets the following
	// requirements:
	// ■ Creates an array with 100 randomly chosen integers.
	// ■ Prompts the user to enter the index of the array, then displays the
	// corresponding
	// element value. If the specified index is out of bounds, display the
	// message Out of Bounds.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[100];
		randomElements(array);
		printArray(array);
	
		System.out.print("\nEnter index: ");
		try {
			int index = input.nextInt();
			System.out.println("Element is: " + array[index]);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index " + ex.getLocalizedMessage() + " is out of bounds");
		} catch (Exception ex) {
			System.out.println("Invalid input.Please enter integer.");
		}
		input.close();
		

	}
	public static void randomElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1+Math.random() * 100);
		}
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print("[" + i + "] ");
		}
	}

}
