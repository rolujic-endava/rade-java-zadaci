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
	private String JMBG;
	private int brojLK;
	
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
	public Vlasnik(String ime, String prezime, String jMBG, int brojLK) {
		super();
		if(ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.ime = ime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase ime.");
		if(prezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.prezime = prezime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase prezime.");
		if(JMBG.length() == 13 && JMBG.matches("[0-9]+"))
			this.JMBG = JMBG;
		else
			throw new IllegalArgumentException("Pogresan unos! - JMBG mora da sadrzi 13 cifara.");
		this.brojLK = brojLK;
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
		if(ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
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
		if(prezime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
			this.prezime = prezime;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite ispravno Vase prezime.");
	}
	/**
	 * @return the jMBG
	 */
	public String getJMBG() {
		return JMBG;
	}
	/**
	 * @param jMBG the jMBG to set
	 */
	public void setJMBG(String jMBG) {
		if(JMBG.length() == 13 && JMBG.matches("[0-9]+"))
			this.JMBG = JMBG;
		else
			throw new IllegalArgumentException("Pogresan unos! - JMBG mora da sadrzi 13 cifara.");
	}
	/**
	 * @return the brojLK
	 */
	public int getBrojLK() {
		return brojLK;
	}
	/**
	 * @param brojLK the brojLK to set
	 */
	public void setBrojLK(int brojLK) {
		this.brojLK = brojLK;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vlasnik [ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + ", brojLK=" + brojLK + "]";
	}
	
	
}
