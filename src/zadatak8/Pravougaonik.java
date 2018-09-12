/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class Pravougaonik extends Kvadrat {

	private double stranicaB;

	
	public Pravougaonik() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Pravougaonik(double stranicaA) {
		super(stranicaA);
		// TODO Auto-generated constructor stub
	}

	
	public Pravougaonik(double stranicaA, double stranicaB) {
		super(stranicaA);
		this.stranicaB = stranicaB;
	}

	/**
	 * @return the stranicaB
	 */
	public double getStranicaB() {
		return stranicaB;
	}

	/**
	 * @param stranicaB the stranicaB to set
	 */
	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}

	/* (non-Javadoc)
	 * @see zadatak8.Kvadrat#povrsina()
	 */
	@Override
	public double povrsina() {
		
		return this.stranicaB * this.getStranicaA();
	}

	/* (non-Javadoc)
	 * @see zadatak8.Kvadrat#obim()
	 */
	@Override
	public double obim() {
		
		return 2 * (this.stranicaB + this.getStranicaA());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pravougaonik [toString()=" + super.toString() + "]";
	}
	
	

}
