/**
 * 
 */
package zadatak9;

/**
 * @author Radovan.Olujic
 *
 */
public class Stan extends Nekretnina {

	private double povrsinaPodruma;
	private double povrsinaTerease;

	public Stan() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresa
	 * @param zona
	 * @param kvadratura
	 * @param vlasnik
	 */
	public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		super(adresa, zona, kvadratura, vlasnik);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresa
	 * @param zona
	 * @param kvadratura
	 * @param vlasnik
	 * @param povrsinaPodruma
	 * @param povrsinaTerease
	 */
	public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma,
			double povrsinaTerease) {
		super(adresa, zona, kvadratura, vlasnik);
		if (0 < povrsinaPodruma)
			this.povrsinaPodruma = povrsinaPodruma;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
		if (0 < povrsinaTerease)
			this.povrsinaTerease = povrsinaTerease;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
	}

	/**
	 * @return the povrsinaPodruma
	 */
	public double getPovrsinaPodruma() {
		return povrsinaPodruma;
	}

	/**
	 * @param povrsinaPodruma the povrsinaPodruma to set
	 */
	public void setPovrsinaPodruma(double povrsinaPodruma) {
		if (0 < povrsinaPodruma)
			this.povrsinaPodruma = povrsinaPodruma;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
	}

	/**
	 * @return the povrsinaTerease
	 */
	public double getPovrsinaTerease() {
		return povrsinaTerease;
	}

	/**
	 * @param povrsinaTerease the povrsinaTerease to set
	 */
	public void setPovrsinaTerease(double povrsinaTerease) {
		if (0 < povrsinaTerease)
			this.povrsinaTerease = povrsinaTerease;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak9.Nekretnina#racunanjeCene()
	 */
	@Override
	public double racunanjeCene() {
		// TODO Auto-generated method stub
		return this.getKvadratura() * this.cenaKvadrata()
				+ ((povrsinaPodruma + povrsinaTerease) * this.cenaKvadrata() * 0.33);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stan [povrsinaPodruma=" + povrsinaPodruma + ", povrsinaTerease=" + povrsinaTerease
				+ ", racunanjeCene()=" + racunanjeCene() + ", getAdresa()=" + getAdresa() + ", getZona()=" + getZona()
				+ ", getKvadratura()=" + getKvadratura() + ", getVlasnik()=" + getVlasnik() + "]";
	}

}
