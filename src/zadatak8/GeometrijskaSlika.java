/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public abstract class GeometrijskaSlika {

	public abstract double povrsina();
	public abstract double obim();
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GeometrijskaSlika [povrsina()=" + povrsina() + ", obim()=" + obim() + "]";
	}
	
	
}
