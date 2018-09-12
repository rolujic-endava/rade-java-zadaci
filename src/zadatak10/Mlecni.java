/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public class Mlecni extends Proizvodi {

	private String porekloMleka;
	private final int PDV = 20;

	public Mlecni() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param cena
	 * @param rokTrajanja
	 */
	public Mlecni(String ime, double cena, String rokTrajanja, String porekloMleka) {
		super(ime, cena, rokTrajanja);
		this.porekloMleka = porekloMleka;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param porekloMleka
	 */
	public Mlecni(String porekloMleka) {
		super();
		this.porekloMleka = porekloMleka;
	}

	/**
	 * @return the porekloMleka
	 */
	public String getPorekloMleka() {
		return porekloMleka;
	}

	/**
	 * @param porekloMleka the porekloMleka to set
	 */
	public void setPorekloMleka(String porekloMleka) {
		this.porekloMleka = porekloMleka;
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
		return "Mlecni [" + super.toString() + ", porekloMleka=" + porekloMleka + ", PDV=" + PDV + ", ukupnaCena="
				+ ukupnaCena() + "]";
	}

}
