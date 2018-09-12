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

/**
 * @author Radovan.Olujic
 *
 */
public class Main {
	public static void main(String[] args) {

		Proizvodi mleko = new Mlecni("sir", 750.00, "decembar 2018", "kravlje");
		Proizvodi meso = new Meso("but", 850.00, "jun 2019", "junetina");
		Proizvodi kafa = new Kafa("Minas", 240.00, "januar 2020", true);
		Proizvodi sokovi = new Sokovi("Nektar", 120.20, "novembar 2018", "jagoda");

		System.out.println(mleko.toString());
		System.out.println(meso.toString());
		System.out.println(kafa.toString());
		System.out.println(sokovi.toString());
	}
}
