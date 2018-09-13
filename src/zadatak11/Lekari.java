/**
 * 
 */
package zadatak11;

/**
 * @author Radovan.Olujic
 *
 */
public class Lekari extends Zaposleni {

	/**
	 * @param ime
	 * @param prezime
	 * @param adrresa
	 * @param telefon
	 * @param datumRodjenja
	 */
	public Lekari(String ime, String prezime, String adrresa, String telefon, String datumRodjenja) {
		super(ime, prezime, adrresa, telefon, datumRodjenja);
	}

	/**
	 * @param ime
	 * @param prezime
	 * @param adrresa
	 * @param telefon
	 * @param datumRodjenja
	 * @param fakultet
	 */
	public Lekari(String ime, String prezime, String adrresa, String telefon, String datumRodjenja, String fakultet) {
		super(ime, prezime, adrresa, telefon, datumRodjenja);
		this.fakultet = fakultet;
	}

	private String fakultet;

	/**
	 * @return the fakultet
	 */
	public String getFakultet() {
		return fakultet;
	}

	/**
	 * @param fakultet the fakultet to set
	 */
	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	

}
