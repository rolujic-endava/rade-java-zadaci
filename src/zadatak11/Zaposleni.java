/**
 * 
 */
package zadatak11;

/**
 * @author Radovan.Olujic
 *
 */
public abstract class Zaposleni {

	private String ime = "";
	private String prezime = "";
	private String adrresa = "";
	private String telefon = "";
	private String datumRodjenja = "";

	/**
	 * @param ime
	 * @param prezime
	 * @param adrresa
	 * @param telefon
	 * @param datumRodjenja
	 */
	public Zaposleni(String ime, String prezime, String adrresa, String telefon, String datumRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.adrresa = adrresa;
		this.telefon = telefon;
		this.datumRodjenja = datumRodjenja;
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
		this.ime = ime;
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
		this.prezime = prezime;
	}

	/**
	 * @return the adrresa
	 */
	public String getAdrresa() {
		return adrresa;
	}

	/**
	 * @param adrresa the adrresa to set
	 */
	public void setAdrresa(String adrresa) {
		this.adrresa = adrresa;
	}

	/**
	 * @return the telefon
	 */
	public String getTelefon() {
		return telefon;
	}

	/**
	 * @param telefon the telefon to set
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	/**
	 * @return the datumRodjenja
	 */
	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	/**
	 * @param datumRodjenja the datumRodjenja to set
	 */
	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

}
