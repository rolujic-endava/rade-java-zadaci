/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public class Kafa extends Proizvodi {

	// private boolean samlevena;
	private TipKafe tipKafe;
	private final double PDV = 0.08;

	/**
	 * @param samlevena
	 */
	public Kafa(TipKafe tipKafe) {
		this.tipKafe = tipKafe;
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
	public Kafa(String ime, double cena, String rokTrajanja, TipKafe tipKafe) {
		super(ime, cena, rokTrajanja);
		this.tipKafe = tipKafe;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the samlevena
	 */
//	public boolean isSamlevena() {
//		return samlevena;
//	}

	public TipKafe getTipKafe() {
		return tipKafe;
	}
//	/**
//	 * @param samlevena the samlevena to set
//	 */
//	public void setSamlevena(boolean samlevena) {
//		this.samlevena = samlevena;
//	}

	public void setTipKafe(TipKafe tipKafe) {
		this.tipKafe = tipKafe;
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
		return "Kafa [" + super.toString() + ", tip kafe=" + tipKafe + ", PDV=" + PDV + ", ukupnaCena=" + ukupnaCena()
				+ "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

}
