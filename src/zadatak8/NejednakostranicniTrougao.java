/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class NejednakostranicniTrougao extends Trougao{

	private double strB;
	private double strC;
	
	public NejednakostranicniTrougao() {
		super();
		
	}
	
	public NejednakostranicniTrougao(double strA) {
		super(strA);
		
	}
	
	public NejednakostranicniTrougao(double strA, double strB, double strC) {
		super(strA);
		this.strB = strB;
		this.strC = strC;
	}

	/* (non-Javadoc)
	 * @see zadatak8.Trougao#povrsina()
	 */
	@Override
	public double povrsina() {
		double poluobim = (this.getStrA() + this.strB + this.strC) / 2;
		return Math.sqrt(poluobim * (poluobim - this.getStrA()) * 
				(poluobim - this.strB ) * (poluobim - this.strC));
	}

	/* (non-Javadoc)
	 * @see zadatak8.Trougao#obim()
	 */
	@Override
	public double obim() {
		
		return this.getStrA() + this.strB + this.strC;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NejednakostranicniTrougao [toString()=" + super.toString() + "]";
	}
	
	
}
