/**
 * 
 */
package zadatak9;

/**
 * @author Radovan.Olujic
 *
 */
public class Kuca extends Nekretnina {

	private double povrsinaOkucnice;

	
	/**
	 * 
	 */
	public Kuca() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param adresa
	 * @param zona
	 * @param kvadratura
	 * @param vlasnik
	 */
	public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
		super(adresa, zona, kvadratura, vlasnik);
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param adresa
	 * @param zona
	 * @param kvadratura
	 * @param vlasnik
	 * @param povrsinaOkucnice
	 */
	public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
		super(adresa, zona, kvadratura, vlasnik);
		if(0 < povrsinaOkucnice)
			this.povrsinaOkucnice = povrsinaOkucnice;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
	}

	

	/**
	 * @return the povrsinaOkucnice
	 */
	public double getPovrsinaOkucnice() {
		return povrsinaOkucnice;
	}


	/**
	 * @param povrsinaOkucnice the povrsinaOkucnice to set
	 */
	public void setPovrsinaOkucnice(double povrsinaOkucnice) {
		if(0 < povrsinaOkucnice)
			this.povrsinaOkucnice = povrsinaOkucnice;
		else
			throw new IllegalArgumentException("Pogresan unos! - Unesite kvadraturu ponovo.");
	}

	

	/* (non-Javadoc)
	 * @see zadatak9.Nekretnina#racunanjeCene()
	 */
	@Override
	public double racunanjeCene() {
		// TODO Auto-generated method stub
		return this.getKvadratura() * this.cenaKvadrata() + povrsinaOkucnice * this.cenaKvadrata() * 0.15;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kuca [povrsinaOkucnice=" + povrsinaOkucnice + ", racunanjeCene()=" + racunanjeCene() + ", getAdresa()="
				+ getAdresa() + ", getZona()=" + getZona() + ", getKvadratura()=" + getKvadratura() + ", getVlasnik()="
				+ getVlasnik() + ", cenaKvadrata()=" + cenaKvadrata() + "]";
	}
	
	
	
}
