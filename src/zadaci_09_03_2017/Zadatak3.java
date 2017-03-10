package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {
	// (InputMismatchException) Write a program that prompts the user to read
	// two integers and displays their sum. Your program should prompt the user
	// to
	// read the number again if the input is incorrect.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		int num1 = 0;
		int num2 = 0;
		boolean isOn = false;
		while (!isOn) {
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();
				isOn = true;
			} catch (InputMismatchException ex) {

				System.out.println("Invalid Input.Enter 2 integers: ");
				input.nextLine();
			}
		}
		input.close();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}
