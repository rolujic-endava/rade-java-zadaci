/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public class Kafa extends Proizvodi {

	private boolean samlevena;
	private final int PDV = 8;

	/**
	 * @param samlevena
	 */
	public Kafa(boolean samlevena) {
		super();
		this.samlevena = samlevena;
	}

	/**
	 * 
	 */
	public Kafa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param cena
	 * @param rokTrajanja
	 */
	public Kafa(String ime, double cena, String rokTrajanja, boolean samlevena) {
		super(ime, cena, rokTrajanja);
		this.samlevena = samlevena;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the samlevena
	 */
	public boolean isSamlevena() {
		return samlevena;
	}

	/**
	 * @param samlevena the samlevena to set
	 */
	public void setSamlevena(boolean samlevena) {
		this.samlevena = samlevena;
	}

	/**
	 * @return the pDV
	 */
	public int getPDV() {
		return PDV;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak10.Proizvodi#ukupnaCena()
	 */
	@Override
	public double ukupnaCena() {
		// TODO Auto-generated method stub
		return getCena() + (getCena() * PDV / 100.0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kafa [" + super.toString() + ", samlevena=" + samlevena + ", PDV=" + PDV + ", ukupnaCena="
				+ ukupnaCena() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

}
