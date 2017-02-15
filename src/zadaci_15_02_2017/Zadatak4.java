package zadaci_15_02_2017;

public class Zadatak4 {
	// Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih
	// pozitivnih djelilaca, isključujući sebe. Na primjer, 6 je prvi savršeni
	// broj jer 6 = 3 + 2 + 1. Sljedeći savršeni broj je 28 jer 28 = 14 + 7 + 4
	// + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite
	// program koji ispisuje sva 4.

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 10000; i++) {
			// "j" predstavlja djelioce i krece se od nula do broja i
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			// ako je suma djelioca jednaka broju ispisujemo ga
			if (sum == i) {
				System.out.print(i + " ");
			}
			// sumu vraćamo na 0 da bi mogli provjeriti sledeći broj
			sum = 0;
		}

	}

}
