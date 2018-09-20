/**
 * 
 */
package zadatak11;

/**
 * @author Radovan.Olujic
 *
 */
public class MedicinskeSestre extends Zaposleni {

	private String smena;

	/**
	 * @param ime
	 * @param prezime
	 * @param adrresa
	 * @param telefon
	 * @param datumRodjenja
	 */
	public MedicinskeSestre(String ime, String prezime, String adrresa, String telefon, String datumRodjenja) {
		super(ime, prezime, adrresa, telefon, datumRodjenja);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param prezime
	 * @param adrresa
	 * @param telefon
	 * @param datumRodjenja
	 * @param smena
	 */
	public MedicinskeSestre(String ime, String prezime, String adrresa, String telefon, String datumRodjenja,
			String smena) {
		super(ime, prezime, adrresa, telefon, datumRodjenja);
		this.smena = smena;
	}

	/**
	 * @return the smena
	 */
	public String getSmena() {
		return smena;
	}

	/**
	 * @param smena the smena to set
	 */
	public void setSmena(String smena) {
		this.smena = smena;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MedicinskeSestre []";
	}

}
