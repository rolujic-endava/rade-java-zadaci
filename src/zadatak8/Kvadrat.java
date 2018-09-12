/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class Kvadrat extends GeometrijskaSlika {

	private double stranicaA;

	
	public Kvadrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Kvadrat(double stranicaA) {
		super();
		this.stranicaA = stranicaA;
	}

	/**
	 * @return the stranicaA
	 */
	public double getStranicaA() {
		return stranicaA;
	}

	/**
	 * @param stranicaA the stranicaA to set
	 */
	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak8.GeometrijskaSlika#povrsina()
	 */
	@Override
	public double povrsina() {

		return Math.pow(stranicaA, 2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak8.GeometrijskaSlika#obim()
	 */
	@Override
	public double obim() {

		return 4 * stranicaA;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kvadrat [toString()=" + super.toString() + "]";
	}

}
