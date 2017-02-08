package zadaci_08_02_2017;

public class Zadatak4 {
	// Napišite program koji generiše 100 nasumičnih cijelih brojeva između 0 i
	// 9
	// te ispisuje koliko se puta koji broj ponovio.

	public static void main(String[] args) {

		// Napravimo dva niza.Prvi sadrži brojeve od 0 do 9 a drugi je prazna.
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;

		}
		int[] array2 = new int[10];

		// Generišemo 100 random brojeva od 0 do 9.Ako je broj jednak nekom
		// broju
		// broju u prvom nizu onda povećavamo broj na istom indeksu u drugom
		// nizu
		for (int i = 0; i < 100; i++) {
			int randomNumber = (int) (Math.random() * 10);

			for (int j = 0; j < array1.length; j++) {
				if (randomNumber == array1[j]) {
					array2[j]++;
				}

			}
		}
		// Ispisujemo rezultate
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Broj " + array1[i] + " se ponavlja " + array2[i] + " puta.");

		}

	}

}
