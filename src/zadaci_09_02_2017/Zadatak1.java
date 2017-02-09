package zadaci_09_02_2017;
//Napisati program koji ispisuje sve prestupne godine, 10 po liniji,

//od godine 101 do 2100, odvojene jednim spaceom. Također ispisati i ukupan broj 
//prijestupnih godina u ovom vremenskom periodu.

public class Zadatak1 {

	public static void main(String[] args) {
		// prolazimo petljom od godine 101 do 2100 i tražimo koje su prestupne
		// te ih ispisujemo.Godina je prestupna ako je djeljiva sa 4 ali ne sa
		// 100
		// ili je djeljiva sa 400
		int countYears = 0;
		int countNum = 0;
		for (int i = 101; i <= 2100; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.print(i + " ");
				countNum++;
				countYears++;
				// podesimo da ispisuje 10 u redu
				if (countNum % 10 == 0) {
					System.out.println();
				}

			}

		}
		// ispisujemo koliko ima ukupno prestupnih godina
		System.out.println();
		System.out.println("Izmedju 101 i godine 2100 ima " + countYears + " prestupnih godina");

	}

}
