package mini2_CrapsAndCreditCards;

public class Game_Craps {
	// If the sum is 2, 3, or 12 (called craps), you lose
	// if the sum is 7 or 11 (called natural), you win;
	// if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is
	// established
	// Continue to roll the dice until either a 7 or the same point value is
	// rolled. If 7 is rolled, you lose. Otherwise, you win.

	public static void main(String[] args) {

		int points = 0;
		boolean off = true;

		while (off) {

			int dice1 = (int) (1+Math.random() * 6);
			int dice2 = (int) (1+Math.random() * 6);

			if ((dice1 + dice2) == 2 || (dice1 + dice2) == 3 || (dice1 + dice2) == 12) {
				System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + (dice1 + dice2) + "\nYou win");
				off = false;
			} else if ((dice1 + dice2) == 7 || (dice1 + dice2) == 11) {
				System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + (dice1 + dice2) + "\nYou win");
				off = false;
			} else {
				points = (dice1 + dice2);
				System.out
						.println("You rolled " + dice1 + "+" + dice2 + "=" + (dice1 + dice2) + "\nPoints are " + points);
				while (off) {

					dice1 = (int) (1+Math.random() * 6);
					dice2 = (int) (1+Math.random() * 6);

					if ((dice1 + dice2) == 7) {
						System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + (dice1 + dice2) + "\nYou lose");

						off = false;
					} else if ((dice1 + dice2) == points) {
						System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + (dice1 + dice2) + "\nYou win");
						off = false;
					} else {
						System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + (dice1 + dice2) + "\nPoints are "
								+ points);
						

					}

				}

			}

		}
	}

}
