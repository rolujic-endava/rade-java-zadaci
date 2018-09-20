/**
 * Napisati program koji opisuje sledeci scenario:
 * Firma posedujeniz privatnih bolnica. Svaka bolnica ima svoje zaposlene. Zaposleni mogu biti:
 * 		- Lekari
 * 		- Osoblje
 * 		- Medicinske sestre.
 * Bolnica sadrzi informacije o nazivu, direktoru i broju zaposlenih. Podaci koji se cuvaju o lekaru su:
 * 		- Fakultet
 * 		- Ime
 * 		- Prezime
 * 		- Adresa
 * 		- Telefon
 * 		- Datum rodjenja.
 * O osobllju cuvamo iste stvari, osim informacije o fakultetu. Za medicinske sestre jos i smenu. Firma
 * sadrzi metodu toString() koja ispisuje koliko poseduje bolnica i lekara, medicinskih sestara i 
 * osoblja ponaosob.  
 */
package zadatak11;

import java.util.ArrayList;

/**
 * @author Radovan.Olujic
 *
 */
public class Main {
	public static void main(String[] args) {

		Lekari lekar1 = new Lekari("Petar", "Petrovic", "Malatisumina 3", "0633323987", "02.01.1963.", "USLA");
		Lekari lekar2 = new Lekari("Ivica", "Petrovic", "Gospodarska 3", "0633553987", "12.11.1958.", "London");

		Osoblje osoblje1 = new Osoblje("Ivan", "ivanovic", "Vuka Karadzica 1", "0602214536", "09.12.1982");
		Osoblje osoblje2 = new Osoblje("Goran", "Bozic", "Igmanska 3", "065668987", "03.11.1971.");
		Osoblje osoblje3 = new Osoblje("Bojana", "Stankovic", "Vuka Karadzica 1", "0608874536", "09.12.1972");
		Osoblje osoblje4 = new Osoblje("Milica", "Korac", "Bulevar olsobodjenja  1", "060200536", "09.12.1988");

		MedicinskeSestre sestra1 = new MedicinskeSestre("Jelena", "Ivanovic", "Bulevar Kralja Aleksandra 112",
				"064112113", "11.11.1990.", "prva");
		MedicinskeSestre sestra2 = new MedicinskeSestre("Ivana", "Tubic", "Bulevar Oslobodjenja 12", "0645643113",
				"21.12.1980.", "druga");
		MedicinskeSestre sestra3 = new MedicinskeSestre("Jovana", "Krsmanovic", "Zarka Zrenjanina 11", "0641155513",
				"15.01.1988.", "prva");
		MedicinskeSestre sestra4 = new MedicinskeSestre("Olga", "Strojkovic", "Grge Andrijanovica 62", "06411998983",
				"09.08.1977.", "treca");

		ArrayList<Lekari> lekari = new ArrayList<>();
		lekari.add(lekar1);
		lekari.add(lekar2);

		ArrayList<Osoblje> osoblje = new ArrayList<>();
		osoblje.add(osoblje1);
		osoblje.add(osoblje2);
		osoblje.add(osoblje3);
		osoblje.add(osoblje4);

		ArrayList<MedicinskeSestre> medicinskeSestre = new ArrayList<>();
		medicinskeSestre.add(sestra1);
		medicinskeSestre.add(sestra2);
		medicinskeSestre.add(sestra3);
		medicinskeSestre.add(sestra4);

		Bolnica bolnica1 = new Bolnica("Sveti Sava", "Petar Kocic", lekari, medicinskeSestre, osoblje);
		Bolnica bolnica2 = new Bolnica("Sveti Vrac", "Ivica Dragutinovic", lekari, medicinskeSestre, osoblje);

		ArrayList<Bolnica> listaBolnica = new ArrayList<>();
		listaBolnica.add(bolnica1);
		listaBolnica.add(bolnica2);

		Firma firma = new Firma(listaBolnica);

		System.out.println(firma.toString());
	}
}
