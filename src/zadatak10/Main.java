/**
 * Napisati program koji opisuje sledeci scenario:
 * Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledecim kategorijama proizvoda:
 * 		- Mlecni proizvodi
 * 		- Kafe
 * 		- Sokovi
 * 		- Meso
 * O svim proizvodima cuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja.
 * Kod mlecnih proizvoda cuvamo i poreklo mleka.
 * Kod kafe da li je u zrnu ili samlevena.
 * O sokovima cuvamo od cega je sok.
 * Kod mesa cuvamo od koje zivotinje je meso.
 * Kod cene mlecnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%.
 */
package zadatak10;

import java.util.ArrayList;

/**
 * @author Radovan.Olujic
 *
 */
public class Main {
	public static void main(String[] args) {

		Proizvodi mleko = new Mlecni("sir", 750.00, "decembar 2018", "kravlje");
		Proizvodi meso = new Meso("but", 850.00, "jun 2019", "junetina");
		Proizvodi kafa = new Kafa("Minas", 240.00, "januar 2020", TipKafe.samlevena);
		Proizvodi sokovi = new Sokovi("Nektar", 120.20, "novembar 2018", "jagoda");

		ArrayList<Proizvodi> lista = new ArrayList<>();
		lista.add(mleko);
		lista.add(meso);
		lista.add(kafa);
		lista.add(sokovi);

		System.out.println("Scenario 1: Imamo dovoljno sredstava, izvrsena kupovina.");
		Firma firma = new Firma(2200, lista);

		firma.porudzbina();
		System.out.println();
		Firma firma1 = new Firma(1200, lista);

		System.out.println("Scenario 2: Nismo ubacili ni jedan proizvod u listu zelja.");
		firma1.porudzbina();

		lista.add(mleko);
		lista.add(meso);
		lista.add(kafa);
		lista.add(sokovi);
		Firma firma2 = new Firma(1200, lista);

		System.out.println();
		System.out.println("Scenario 3: Nemamo dovoljno sredstava.");
		firma2.porudzbina();

	}
}
