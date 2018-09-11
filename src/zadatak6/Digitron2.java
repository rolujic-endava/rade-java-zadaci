/**
 * Modifikacija digitrona od prosle nedelje (Predavanje 1 - Zadatak2): Sve operacije smestiti
 * i posebne metode, i kada je to potrebno pozvati odgovarajucu metodu. Vrteti se u petlji, 
 * sve dok se za kod operaceije ne unese nepostojeci kod (default kod switch-a). 
 */
package zadatak6;

import java.util.Scanner;

/**
 * @author Radovan.Olujic
 *
 */
public class Digitron2 {

	static Scanner ulaz = new Scanner(System.in);

	public static void main(String[] args) {

		int prviBroj;
		int drugiBroj;
		String operacija;

		while (true) {
			System.out.println("Unesite prvi broj: ");
			prviBroj = unosInt();

			System.out.println("Unesite drugi broj: ");
			drugiBroj = unosInt();

			System.out.println("Izaberite operaciju: s - sabiranj, o - oduzimanje, m - mnozenje, d - deljenje");

			operacija = ulaz.next();

			switch (operacija) {
			case "s":
				System.out.println(sabiranje(prviBroj, drugiBroj));

				continue;

			case "o":
				System.out.println(oduzimnanje(prviBroj, drugiBroj));
				continue;

			case "m":
				System.out.println(mnozenje(prviBroj, drugiBroj));
				continue;

			case "d":
				if (drugiBroj != 0)
					System.out.println(deljenje(prviBroj, drugiBroj));
				else
					System.out.println("Nije dozvoljeno deljenje sa nulom");
				continue;

			}

			if (operacija.equals("[somd]"))
				continue;
			else {

				System.out.print("Kraj programa!");
				break;
			}

		}
	}

	private static int oduzimnanje(int a, int b) {
		return a - b;

	}

	private static int sabiranje(int a, int b) {
		return a + b;

	}

	private static int mnozenje(int a, int b) {
		return a * b;

	}

	private static double deljenje(int a, int b) {
		return a / (double)b;

	}

	private static int unosInt() {

		while (!ulaz.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo.");
			ulaz.next();
		}
		return ulaz.nextInt();

	}
}
