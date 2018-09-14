/**
 * Napisati program koji umogucava unos imena studenta i broj poena osvojenih na testu preko
 * standardnog ulaza (sve dok se ne unese odredjen znak za prekid unosa podataka).
 * Broj poena sme da bude od 0 do 100.
 * Kao r4ezultat programa,  ocekuje se izlazni fiajl "ocene.txtx" u kome ce se nalaziti lista 
 * svih studenata sortirana po poenima, od najvise ka najmanje, i gde ce se osim imena studenta
 *  i boja poena nalaziti i ocena koju je dobio na ispiti.
 *  Ocena 10 akoje imao vise od 90 poena, 9 ako je imao izmedju 81 i 90... Sve do 5 ako je imao 
 *  manje od 51 poena.
 */
package zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

/**
 * @author Radovan.Olujic
 *
 */
public class Main {

	static ArrayList<Student> studenti = new ArrayList<Student>();
	static Scanner ulaz = new Scanner(System.in);

	public static void main(String[] args) {

		unosStudenata();

		ulaz.close();
		
		Collections.sort(studenti, Collections.reverseOrder());

		for (Student s : studenti) {
			System.out.println(s);
		}

		File file = new File("ocene.txt");

		for (Student s : studenti) {
			try {
				PrintWriter pw = new PrintWriter((new FileWriter("ocene.txt", true)));
				pw.println(s.toString());
				System.out.println("Fajl je uspesno upisan u datoteku.");
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

	private static void unosStudenata() {
		boolean provera = true;
		int count = 0;
		while (provera) {
			count++;
			System.out.println("Unesite studente " + count + " .");
			System.out.println("Unesite ime studenta: ");
			String ime = ulaz.next();
			System.out.println("Unesite prezime studenta: ");
			String prezime = ulaz.next();
			System.out.println("Unesite broj poena: ");
			int brojPoena = ulaz.nextInt();
			studenti.add(new Student(ime, prezime, brojPoena));
			System.out.println("Za KRAJ unosa, unesite broj 1!");
			System.out.println("Za NASTAVAK unosa, unesite bilo koji karakter!");

			if (ulaz.next().equals("1"))
				provera = false;
			;

		}

	}
}
