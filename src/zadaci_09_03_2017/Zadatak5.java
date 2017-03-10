package zadaci_09_03_2017;

public class Zadatak5 {
	// (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
	// throw IllegalArgumentException if the loan amount, interest rate, or
	// number of years is less than or equal to zero.

	public static void main(String[] args) {
		try {
			Loan loan = new Loan(5, 5, 10);
			System.out.println("Total payment is: " + loan.getTotalPayment());

		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException: " + ex.getMessage());

		}

	}

}
