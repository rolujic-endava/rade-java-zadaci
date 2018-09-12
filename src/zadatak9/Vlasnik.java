/**
 * 
 */
package zadatak9;

/**
 * @author Radovan.Olujic
 *
 */
public class Vlasnik {

	private String ime;
	private String prezime;
	private String jmbg;
	private String brojLK;

	public Vlasnik() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param prezime
	 * @param jMBG
	 * @param brojLK
	 */
	public Vlasnik(String ime, String prezime, String jmbg, String brojLK) {

		if (ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.ime = ime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase ime.");
		if (prezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.prezime = prezime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase prezime.");
		if (jmbg.length() == 13 && jmbg.matches("[0-9]+"))
			this.jmbg = jmbg;
		else
			throw new IllegalArgumentException("Pogresan unos! - JMBG mora da sadrzi 13 cifara.");
		if(brojLK.length() == 9 && brojLK.matches("[0-9]+"))
			this.brojLK = brojLK;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ponovo Vas broj licne karte.");
		
	}

	/**
	 * @return the ime
	 */
	public String getIme() {
		return ime;
	}

	/**
	 * @param ime the ime to set
	 */
	public void setIme(String ime) {
		if (ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.ime = ime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase ime.");
	}

	/**
	 * @return the prezime
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * @param prezime the prezime to set
	 */
	public void setPrezime(String prezime) {
		if (prezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.prezime = prezime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase prezime.");
	}

	/**
	 * @return the jMBG
	 */
	public String getJmbg() {
		return jmbg;
	}

	/**
	 * @param jMBG the jMBG to set
	 */
	public void setJmbg(String jmbg) {
		if (jmbg.length() == 13 && jmbg.matches("[0-9]+"))
			this.jmbg = jmbg;
		else
			throw new IllegalArgumentException("Pogresan unos! - JMBG mora da sadrzi 13 cifara.");
	}

	/**
	 * @return the brojLK
	 */
	public String getBrojLK() {
		return brojLK;
	}

	/**
	 * @param brojLK the brojLK to set
	 */
	public void setBrojLK(String brojLK) {
		if(brojLK.length() == 9 && brojLK.matches("[0-9]+"))
			this.brojLK = brojLK;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ponovo Vas broj licne karte.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " [ime=" + ime + ", prezime=" + prezime + ", JMBG=" + jmbg + ", brojLK=" + brojLK + "]";
	}

}
