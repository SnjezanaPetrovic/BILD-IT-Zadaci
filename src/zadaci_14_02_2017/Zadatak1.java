package zadaci_14_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak1 {
	// Napisati program koji učitava iznos investicije, godišnju interesnu stopu
	// i broj godina te vraća buduću vrijednost investicije koristeći se
	// sljedećom formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
	// mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao
	// iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj
	// godina program vam vraća 1032.98 kao buducu vrijednost investicije.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.###");

		try {
			System.out.println("Unesite iznos investicije: ");
			double balance = input.nextDouble();
			System.out.println("Unesite godišnju interesnu stopu: ");
			double yearPercentage = input.nextDouble();
			System.out.println("Unesite broj godina: ");
			int numberOfYears = input.nextInt();
			if (balance > 0 && numberOfYears > 0) {
				System.out.println("Buduća vrijednost investicije je: "
						+ df.format(calculateFutureBalance(balance, yearPercentage, numberOfYears)));
			} else {
				System.out.println("Iznos investicije i broj godina moraju biti pozitivni");
			}

		} catch (Exception ex) {
			System.out.println("Došlo je do greške.");
			input.nextLine();
		}
		input.close();

	}

	public static double calculateFutureBalance(double balance, double yearPercentage, int numberOfYears) {
		double monthPercentage = yearPercentage / 12;
		double futureBalance = balance * Math.pow((1 + monthPercentage / 100), (numberOfYears * 12));
		return futureBalance;
	}

}
