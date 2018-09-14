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
	private final double PDV = 0.08;

	/**
	 * @param samlevena
	 */
	public Kafa(boolean samlevena) {
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
	public double getPDV() {
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
		return getCena() + (getCena() * PDV);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kafa [" + super.toString() + ", samlevena=" + ((samlevena) ? "mlevena" : "u zrnu") + ", PDV=" + PDV + ", ukupnaCena="
				+ ukupnaCena() + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

}
