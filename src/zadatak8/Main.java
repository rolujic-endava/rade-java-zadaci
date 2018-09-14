
/*	
 * Kreirati projekat Geometrijske slike na sledeci nacin:	
 * - Apstraktna klasa Geometrijska Slika	
 * - Tri osnovne klase Krug, Kvadrat, Trougao	
 * - Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni Trougao	
 * - Klase imaju preklopljenu metodu toString() u kojoj se ispisuju obim i povrsina	
 * - Svaka klasa treba da sadrzi po 3 konstruktora	
 * - Klasa Trougao definise jednakostranicni Trougao	
 * - Obim elipse se racuna aPI(9-sqrt35)/2, a povrsina abPI	
 * Napraviti Main klasu i u njoj kreirati instance klase Geometrijska slika i napraviti objekte svih osnovnih i 	
 * izvedenih klasa sa proizvoljnim argumentima. Ispisati String reprezentaciju objekta - toString()	
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
