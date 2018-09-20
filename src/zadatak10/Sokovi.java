/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public class Sokovi extends Proizvodi {

	private String sastav;
	private final double PDV = 0.2;

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
		this.sastav = odCegaje;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the odCegaJe
	 */
	public String getSastav() {
		return sastav;
	}

	/**
	 * @param odCegaJe the odCegaJe to set
	 */
	public void setSastav(String odCegaJe) {
		this.sastav = odCegaJe;
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
		return "Sokovi [" + super.toString() + ", sastav=" + sastav + ", PDV=" + PDV + ", ukupnaCena="
				+ ukupnaCena() + "]";
	}

}
