package zadaci_25_02_2017;

public class Zadatak1 {
	// (Count single digits) Write a program that generates 100 random integers
	// between
	// 0 and 9 and displays the count for each number. (Hint: Use an array of
	// ten integers,
	// say counts , to store the counts for the number of 0s, 1s, . . . , 9s.)

	public static void main(String[] args) {

		int[] count = new int[10];
		// generišemo 100 cijelih brojeva i smještamo ih u niz.
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 10);
			for (int j = 0; j < count.length; j++) {
				if (num == j) {
					count[j]++;
				}

			}
		}
		// ispisujemo rezultat
		for (int i = 0; i < count.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + count[i] + " puta.");

		}

	}

}
