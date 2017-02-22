package zadaci_22_02_2017;

public class Zadatak1 {
	// Napisati program koji nasumično generiše cijeli broj između 1 i 12 te
	// ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)

	public static void main(String[] args) {
		// Generišemo random broj od 1 do 12 i ispisujemo broj i pozivamo metodu
		// koja vraća ime mjeseca pod tim brojem
		int num = (int) (1 + Math.random() * 12);
		System.out.println("Generisan broj je " + num + " a mjesec je " + nameOfTheMonth(num));

	}

	// Metoda koja vraća ime mjeseca
	public static String nameOfTheMonth(int num) {

		String nameOfTheMonth = "";
		String[] month = { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar",
				"Novembar", "Decembar" };

		int index = num - 1;
		for (int i = 0; i < month.length; i++) {
			if (index == i) {
				nameOfTheMonth = month[i];
			}

		}
		return nameOfTheMonth;
	}

}
