/**
 * 
 */
package zadatak9;

/**
 * @author Radovan.Olujic
 *
 */
public abstract class Nekretnina {

	private String adresa;
	private int zona;
	private double kvadratura;
	private Vlasnik vlasnik;

	/**
	 * 
	 */
	protected Nekretnina() {
	}

	/**
	 * @param adresa
	 * @param zona
	 * @param kvadratura
	 * @param vlasnik
	 */
	protected Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		super();
		this.adresa = adresa;
		if (0 < zona && 5 > zona)
			this.zona = zona;
		else
			throw new IllegalArgumentException("Postoje samo 4 zone! - Izaberite jednu od zona.");
		if (0 < kvadratura)
			this.kvadratura = kvadratura;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
		this.vlasnik = vlasnik;
	}

	/**
	 * @return the adresa
	 */
	public String getAdresa() {
		return adresa;
	}

	/**
	 * @param adresa the adresa to set
	 */
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	/**
	 * @return the zona
	 */
	public int getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(int zona) {
		if (0 < zona && 5 > zona)
			this.zona = zona;
		else
			throw new IllegalArgumentException("Postoje samo 4 zone! - Izaberite jednu od zona.");
	}

	/**
	 * @return the kvadratura
	 */
	public double getKvadratura() {
		return kvadratura;
	}

	/**
	 * @param kvadratura the kvadratura to set
	 */
	public void setKvadratura(double kvadratura) {
		this.kvadratura = kvadratura;
	}

	/**
	 * @return the vlasnik
	 */
	public Vlasnik getVlasnik() {
		return vlasnik;
	}

	/**
	 * @param vlasnik the vlasnik to set
	 */
	public void setVlasnik(Vlasnik vlasnik) {
		this.vlasnik = vlasnik;
	}

	public double cenaKvadrata() {
		switch (zona) {
		case 1:
			return 3000;
		case 2:
			return 2000;
		case 3:
			return 1000;
		default:
			return 500;
		}
	}

	public abstract double racunanjeCene();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nekretnina [adresa=" + adresa + ", zona=" + zona + ", kvadratura=" + kvadratura + ", vlasnik=" + vlasnik
				+ ", racunanjeCene()=" + racunanjeCene() + "]";
	}

}
