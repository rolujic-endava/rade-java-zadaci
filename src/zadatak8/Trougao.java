/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class Trougao extends GeometrijskaSlika {

	private double strA;

	
	public Trougao() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Trougao(double strA) {
		super();
		this.strA = strA;
	}

	/**
	 * @return the stranicaA
	 */
	public double getStrA() {
		return strA;
	}

	/**
	 * @param stranicaA the stranicaA to set
	 */
	public void setStrA(double strA) {
		this.strA = strA;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak8.GeometrijskaSlika#povrsina()
	 */
	@Override
	public double povrsina() {
		
		return (Math.pow(strA, 2) * Math.sqrt(3))/4;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see zadatak8.GeometrijskaSlika#obim()
	 */
	@Override
	public double obim() {
		
		return 3 * strA;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trougao [toString()=" + super.toString() + "]";
	}

}
