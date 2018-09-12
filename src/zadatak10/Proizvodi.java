/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public abstract class Proizvodi {

	private String ime;
	private double cena;
	private String rokTrajanja;

	public Proizvodi() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param cena
	 * @param rokTrajanja
	 */
	public Proizvodi(String ime, double cena, String rokTrajanja) {
		super();
		this.ime = ime;
		this.cena = cena;
		this.rokTrajanja = rokTrajanja;
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
	 * @return the cena
	 */
	public double getCena() {
		return cena;
	}

	/**
	 * @param cena the cena to set
	 */
	public void setCena(double cena) {
		this.cena = cena;
	}

	/**
	 * @return the rokTrajanja
	 */
	public String getRokTrajanja() {
		return rokTrajanja;
	}

	/**
	 * @param rokTrajanja the rokTrajanja to set
	 */
	public void setRokTrajanja(String rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	public abstract double ukupnaCena();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ime=" + ime + ", cena=" + cena + ", rokTrajanja=" + rokTrajanja;
	}

}
