/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class Krug extends GeometrijskaSlika {

	private double poluprecnik;

	public Krug() {
		super();
	}

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	/**
	 * @return the poluprecnik
	 */
	public double getPoluprecnik() {
		return poluprecnik;
	}

	/**
	 * @param poluprecnik the poluprecnik to set
	 */
	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak8.GeometrijskaSlika#povrsina()
	 */
	@Override
	public double povrsina() {

		return Math.PI * Math.pow(poluprecnik, 2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak8.GeometrijskaSlika#obim()
	 */
	@Override
	public double obim() {

		return 2 * poluprecnik * Math.PI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Krug [toString()=" + super.toString() + "]";
	}

}
