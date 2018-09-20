/**
 * 
 */
package zadatak10;

/**
 * @author Radovan.Olujic
 *
 */
public class Meso extends Proizvodi {

	private String zivotinjskoPoreklo;
	private final double PDV = 0.08;

	public Meso() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ime
	 * @param cena
	 * @param rokTrajanja
	 */
	public Meso(String ime, double cena, String rokTrajanja, String zivotinjskoPoreklo) {
		super(ime, cena, rokTrajanja);
		this.zivotinjskoPoreklo = zivotinjskoPoreklo;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the zivotinjskoPoreklo
	 */
	public String getZivotinjskoPoreklo() {
		return zivotinjskoPoreklo;
	}

	/**
	 * @param zivotinjskoPoreklo the zivotinjskoPoreklo to set
	 */
	public void setZivotinjskoPoreklo(String zivotinjskoPoreklo) {
		this.zivotinjskoPoreklo = zivotinjskoPoreklo;
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
		return "Meso [" + super.toString() + ", zivotinjskoPoreklo=" + zivotinjskoPoreklo + ", PDV=" + PDV
				+ ", ukupnaCena=" + ukupnaCena() + "]";
	}

}
