/**
 * 
 */
package zadatak8;

/**
 * @author Radovan.Olujic
 *
 */
public class Main {
public static void main(String[] args) {
	
	GeometrijskaSlika krug = new Krug(5.5);
	GeometrijskaSlika kvadrat = new Kvadrat(5);
	GeometrijskaSlika trougao = new Trougao(5);
	
	GeometrijskaSlika elipsa = new Elipsa(6, 2);
	GeometrijskaSlika pravougaonik = new Pravougaonik(5, 3);
	GeometrijskaSlika nejednakostranicniTrougao = new NejednakostranicniTrougao(5, 4, 3);
	
	System.out.println(krug.toString());
	System.out.println(kvadrat.toString());
	System.out.println(trougao.toString());
	
	System.out.println(elipsa.toString());
	System.out.println(pravougaonik.toString());
	System.out.println(nejednakostranicniTrougao.toString());
	
}
}
