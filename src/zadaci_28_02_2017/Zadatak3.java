package zadaci_28_02_2017;

public class Zadatak3 {
	// (Stopwatch) Design a class named StopWatch . The class contains:
	// *Private data fields startTime and endTime with getter methods.
	// *A no-arg constructor that initializes startTime with the current time.
	// *A method named start() that resets the startTime to the current time.
	// *A method named stop() that sets the endTime to the current time.
	// A method named getElapsedTime() that returns the elapsed time for the
	// stopwatch in milliseconds.
	// Draw the UML diagram for the class and then implement the class. Write a
	// test
	// program that measures the execution time of sorting 100,000 numbers using
	// selection sort.

	public static void main(String[] args) {
		int[] array = new int[100000];
		Stopwatch time = new Stopwatch();
		// startamo štopericu,generišemo brojeve,printamo ih,sortiramo i onda
		// zaustavimo štopericu
		time.start();
		generateArray(array);
		printArray(array);
		sortArray(array);
		time.stop();
		// Ispisujemo rezultat
		System.out.println("Potrebno vrijeme za generisanje,prikaz i sortiranje niza od 100000 elemenata je: "
				+ (time.getElapsedTime() / 1000) + " sekundi");

	}

	// generišemo nasumične cijele brojeve i smještamo ih u niz
	public static void generateArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);

		}

	}

	// metoda koja ispisuje niz
	public static void printArray(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count++;
			if (count % 20 == 0) {
				System.out.println();
			} else {
				System.out.print(array[i] + " ");
			}

		}
		System.out.println();
	}

	// metoda koja sortira niz
	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = 0; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
				if (minIndex != i) {
					int tempElement = array[minIndex];
					array[minIndex] = array[i];
					array[i] = tempElement;
				}
			}

		}
	}

}
