/**
 * 
 */
package zadatak11;

import java.util.ArrayList;

/**
 * @author Radovan.Olujic
 *
 */
public class Firma {

	private ArrayList<Bolnica> listaBolnica;

	/**
	 * @param listaBolnica
	 */
	public Firma(ArrayList<Bolnica> listaBolnica) {
		super();
		this.listaBolnica = listaBolnica;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		int brojacLekara = 0;
		int brojacSestara = 0;
		int brojacOsoblja = 0;

		for (Bolnica bolnica : listaBolnica) {
			brojacLekara += bolnica.getLekari().size();
			brojacSestara += bolnica.getMedicinskeSestre().size();
			brojacOsoblja += bolnica.getOsoblje().size();
		}

		return "Firma - Broj bolnica:  " + listaBolnica.size() + ", Zaposleni[ Lekari: " + brojacLekara
				+ ", medicinske sestre: " + brojacSestara + ", ostalo osoblje: " + brojacOsoblja + "]";
	}

}
