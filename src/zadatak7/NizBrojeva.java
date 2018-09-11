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

		while(duzinaNiza < 5) {
		System.out.println("Unesite duzinu niza(minimalno 5!): ");

		duzinaNiza = unosInt();
		}
		

		niz = new int[duzinaNiza];

		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = ulaz.nextInt();
		}

		System.out.println("Unesite broj x (ispitivanje da li je clan niza): ");
		x = unosInt();

		Arrays.sort(niz);

		for (int i = 0; i < niz.length; i++) {
			
			if (niz[i] == x) {
				postoji = 1;

			}
		}

		if (postoji == 1) {
			System.out.println("\nZadati niz sadrzi broj " + x + "\n");

		} else
			System.out.println("\nZadati broj " + x + " nije clan datog niza.\n");

		System.out.println("Prvih 5 clanova niza su: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(niz[i] + " ");
		}

	}
	
	private static int unosInt() {

		while (!ulaz.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo.");
			ulaz.next();
		}
		return ulaz.nextInt();

	}
}
