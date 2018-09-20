/**
 * Napisati isti program kao u Zadatku 2 koji vraca drugaciji rezultat: ime studenta i poeni
 * na testu se nalaze u nekom fajlu "poeni.txt". Zadatak je ispisati na standardni izlaz spisak
 * studenata (ime, poeni i ocena) sortiran po poenima
 */

package zadatak13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Radovan.Olujic
 *
 */
public class Main {

	static ArrayList<Student> studenti = new ArrayList<Student>();
	static Scanner ulaz;

	public static void main(String[] args) {

		File file = new File("poeni.txt");

		try {
			ulaz = new Scanner(file);
			while (ulaz.hasNext()) {
				String ime = ulaz.next();
				String prezime = ulaz.next();
				int poeni = ulaz.nextInt();
				Student student = new Student(ime, prezime, poeni);
				studenti.add(student);

//			System.out.println(   ime + " " + prezime + " " + poeni ); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ulaz.close();
		Collections.sort(studenti, Collections.reverseOrder());
		for (Student s : studenti) {
			System.out.println(s);
		}

	}
}
