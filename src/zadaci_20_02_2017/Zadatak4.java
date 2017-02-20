package zadaci_20_02_2017;

import java.util.Scanner;

public class Zadatak4 {
	// Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše
	// ta ista tri broja u rastućem redosljedu. Bonus: Napisati metodu koja
	// prima tri cijela broja kao argumente te vraća brojeve u rastućem
	// redosljedu.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite prvi broj: ");
			long num1 = input.nextInt();
			System.out.println("Unesite drugi broj: ");
			long num2 = input.nextInt();
			System.out.println("Unesite treći broj: ");
			long num3 = input.nextInt();
			displaySortedNumbers(num1, num2, num3);

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite cijele brojeve.");
		}
		input.close();

	}

	// Stavila sam long jer ti voliš isprobavati sa brojevima kao sto su
	// 111111111 :)
	public static void displaySortedNumbers(long num1, long num2, long num3) {

		long[] array = { num1, num2, num3 };

		java.util.Arrays.sort(array);

		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}

}
