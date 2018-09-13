/**
 * Za uneti niz celih brojeva duzine n (koji se takodje unosi), sortirati niz, ispitati da li 
 * sadrzi broj x i ispisati prvih 5 clanova niza na standardan izlaz. Koristiti klasu Arrays. 
 */
package zadatak7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Radovan.Olujic
 *
 */
public class NizBrojeva {

	static int duzinaNiza;
	static int x;
	static int postoji;
	static Scanner ulaz = new Scanner(System.in);
	static int niz[];

	public static void main(String[] args) {
		int n = 5;

		while (duzinaNiza < 5) {
			System.out.println("Unesite duzinu niza(minimalno 5!): ");

			duzinaNiza = unosInt();
		}

		niz = new int[duzinaNiza];

		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = unosInt();
		}

		System.out.println("Unesite broj x (ispitivanje da li je clan niza): ");
		x = unosInt();

		sortiraj(niz);

		proveraBrojauNizu(x);

		prvihNclanovaNiza(n);

		ulaz.close();

	}

	/**
	 * sortiranje niza
	 */
	private static void sortiraj(int niz[]) {
		Arrays.sort(niz);

	}

	/**
	 * ispisuje prvih 5 clanova niza
	 */
	private static void prvihNclanovaNiza(int n) {
		System.out.println("Prvih " + n + " clanova niza su: ");
		for (int i = 0; i < n; i++) {
			System.out.print(niz[i] + " ");
		}

	}

	/**
	 * provera da li se zadati broj nalazi u datom nizu
	 */
	private static void proveraBrojauNizu(int x) {
		for (int i = 0; i < niz.length; i++) {

			if (niz[i] == x) {
				postoji = 1;

			}
		}

		if (postoji == 1) {
			System.out.println("Zadati niz sadrzi broj " + x + "\n");

		} else
			System.out.println("Zadati broj " + x + " nije clan datog niza.\n");

	}

	private static int unosInt() {

		while (!ulaz.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo.");
			ulaz.next();
		}
		return ulaz.nextInt();

	}
}
