package zadaci_21_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	// Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva različita
	// pakovanja. Želimo napisati program koji upoređuje cijene ta dva
	// pakovanja. Program pita korisnika da unese težinu i cijenu oba pakovanja
	// te ispisuje koje pakovanje ima bolju cijenu.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// uzimamo podatke od korisnika
			System.out.println("Unesite težinu prvog pakovanja u kg: ");
			double weight1 = input.nextDouble();
			System.out.println("Unesite cijenu prvog pakovanja u KM: ");
			double price1 = input.nextDouble();
			System.out.println("Unesite težinu drugog pakovanja u kg: ");
			double weight2 = input.nextDouble();
			System.out.println("Unesite cijenu drugog pakovanja u KM: ");
			double price2 = input.nextDouble();
			// podaci moraju biti veći od 0
			if (weight1 > 0 && weight2 > 0 && price1 > 0 && price2 > 0) {

				double realCost1 = weight1 / price1;
				double realCost2 = weight2 / price2;
				// poredimo odnos težine i cijene izmedju dva pakovanja
				if (realCost1 > realCost2) {
					System.out.println("Bolju cijenu ima prvo pakovanje.");
				} else if (realCost1 == realCost2) {
					System.out.println("Odnos cijene i kvaliteta je isti.");
				} else {
					System.out.println("Bolju cijenu ima drugo pakovanje.");
				}
			} else {
				System.out.println("Unesene vrijednosti moraju biti veće od 0.");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.Molimo unesite brojeve.");
		}
		input.close();
	}

}
