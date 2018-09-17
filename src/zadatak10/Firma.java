/**
 * 
 */
package zadatak10;

import java.util.ArrayList;

/**
 * @author Radovan.Olujic
 *
 */
public class Firma {

	private double kapital;
	private ArrayList<Proizvodi> listaProizvoda;

	/**
	 * @param kapital
	 * @param listaProizvoda
	 */
	public Firma(double kapital, ArrayList<Proizvodi> listaProizvoda) {
		this.kapital = kapital;
		this.listaProizvoda = listaProizvoda;
	}

	public void porudzbina() {
		int ukupnaCena = 0;
		for (Proizvodi proizvodi : this.listaProizvoda) {
			ukupnaCena += proizvodi.getCena();
		}
		if (this.kapital >= ukupnaCena) {
			if (!this.listaProizvoda.isEmpty()) {
				System.out.println("Izvrsili ste kopovinu!");
				System.out.println("Lista kupljenih proizvoda: " + this.listaProizvoda);
				this.listaProizvoda.clear();
				this.kapital -= ukupnaCena;
				System.out.println("Lista proizvoda je ispraznjena i spremna za novu narudzbinu.");
				System.out.println("Preostali kapital firme posle izvrsene kupovine je: " + this.kapital);
			} else {
				System.out.println("Lista proizvoda je trenutno prazna!");
			}

		} else {
			System.out.println("Nema dovoljno sredstava u kapitalu firme!");

		}
	}

	/**
	 * @return the kapital
	 */
	public double getKapital() {
		return kapital;
	}

}
