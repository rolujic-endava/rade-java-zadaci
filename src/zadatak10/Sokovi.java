/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public class Sokovi extends Proizvodi {

	private String odCegaJe;
	private final int PDV = 20;

	public Sokovi() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param cena
	 * @param rokTrajanja
	 */
	public Sokovi(String ime, double cena, String rokTrajanja, String odCegaje) {
		super(ime, cena, rokTrajanja);
		this.odCegaJe = odCegaje;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the odCegaJe
	 */
	public String getOdCegaJe() {
		return odCegaJe;
	}

	/**
	 * @param odCegaJe the odCegaJe to set
	 */
	public void setOdCegaJe(String odCegaJe) {
		this.odCegaJe = odCegaJe;
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
		return "Sokovi [" + super.toString() + ", odCegaJe=" + odCegaJe + ", PDV=" + PDV + ", ukupnaCena="
				+ ukupnaCena() + "]";
	}

}
