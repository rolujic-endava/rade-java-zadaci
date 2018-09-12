/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class Elipsa extends Krug{

	private double poluprecnik2;

	
	public Elipsa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Elipsa(double poluprecnik) {
		super(poluprecnik);
		// TODO Auto-generated constructor stub
	}

	
	public Elipsa(double poluprecnik, double poluprecnik2) {
		super(poluprecnik);
		this.poluprecnik2 = poluprecnik2;
	}


	/* (non-Javadoc)
	 * @see zadatak8.Krug#povrsina()
	 */
	@Override
	public double povrsina() {
		
		return Math.PI + this.getPoluprecnik() * this.poluprecnik2;
	}


	/* (non-Javadoc)
	 * @see zadatak8.Krug#obim()
	 */
	@Override
	public double obim() {
		
		return (Math.PI * this.getPoluprecnik() * (9 - Math.sqrt(35)))/2;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Elipsa [toString()=" + super.toString() + "]";
	}
	
	
	
	
}
