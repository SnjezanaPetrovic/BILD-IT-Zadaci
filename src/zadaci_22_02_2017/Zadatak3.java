package zadaci_22_02_2017;

public class Zadatak3 {
	// Napisati program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11
	// + 11/13 ..... + 95/97 + 97/99.

	public static void main(String[] args) {

		double sum = 0;

		for (int i = 1; i <= 97; i += 2) {
			sum += i / (i + 2.0);

		}
		System.out.printf("Suma je %5.3f ", sum);

	}

}
