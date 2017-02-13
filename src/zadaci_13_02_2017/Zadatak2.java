package zadaci_13_02_2017;

public class Zadatak2 {
	// Napisati program koji simulira nasumično izvlačenje karte iz špila od 52
	// karte. Program treba ispisati koja karta je izvučena (A, 2, 3, 4, 5, 6,
	// 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik,
	// Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.

	public static void main(String[] args) {

		// Ubacimo brojeve u jedan a boju u drugi niz i izvlacimo random broj i
		// boju

		String[] num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] colour = { "Srce", "Pik", "Djetelina", "Kocka" };

		String numCard = num[(int) (Math.random() * num.length)];
		String colourCard = colour[(int) (Math.random() * colour.length)];

		// Ispisujemo rezultat
		System.out.println("Karta je: " + numCard + "-" + colourCard);

	}

}
