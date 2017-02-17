package zadaci_16_02_2017;

import java.util.Scanner;

public class Zadaci1 {
	// Napisati program koji pita korisnika da unese cijeli broj za današnji dan
	// u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
	// današnjeg dana te mu ispiše koji je to dan u budućnosti. (Primjer: ako
	// korisnik unese 1 kao današnji dan a 3 kao dan u budućnosti program mu
	// ispisuje da je danas utorak a dan u budućnosti je petak.)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Unesite cijeli broj za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...): ");
			int day = input.nextInt();
			if (day < 0 || day > 6) {
				System.out.println("Pogrešan unos.Broj treba da bude od 0 do 6.");
			} else {
				System.out.println("Unesite broj dana nakon današnjeg dana u budućnosti: ");
				int futureDay = input.nextInt();
				if (futureDay <= 0) {
					System.out.println("Unesite broj veći od 0.");
				} else {
					int dayInTheFuture = (day + futureDay) % 7;
					System.out.println("Dan u budućnosti koji ste odabrali je " + getNameOfTheDay(dayInTheFuture));
				}
			}
		} catch (Exception ex) {

			System.out.println("Došlo je do greške.");
		}
		input.close();

	}

	public static String getNameOfTheDay(int day) {

		String nameOfTheDay = "";

		switch (day) {
		case 0:
			nameOfTheDay = "ponedeljak";
			break;
		case 1:
			nameOfTheDay = "utorak";
			break;
		case 2:
			nameOfTheDay = "srijeda";
			break;
		case 3:
			nameOfTheDay = "četvrtak";
			break;
		case 4:
			nameOfTheDay = "petak";
			break;
		case 5:
			nameOfTheDay = "subota";
			break;
		case 6:
			nameOfTheDay = "nedelja";
			break;
		default:
			nameOfTheDay = "Unknow day name";
			break;
		}

		return nameOfTheDay;
	}

}
