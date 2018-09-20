/**
 * Kreirati projekat Nekretnina na sledeci nacin:	
 * - Apstraktna klasa nekretnina koja od atributa ima
 * - adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.	
 * - Vlasnik ima puno ime i prezime, JMBG i broj licne karte.	
 * - Izvedene klase, Stan i Kuca imaju to String() metod gde se ispisuju sve informacije o 
 *   nekretnini ukljucujuci Vlasnika i cenu
 * - Cena se racunapo principu kvadratura X zona 
 *   (I zona 3000, II zona 2000, III zona 1000, IV zona 500e)	
 * - Kuca ima dodatno polje povrsinaOkucnice	
 * - U cenu kuce ulazi i cena okucnice koja se racuna po principu (povrsinaOkucnice X Zona X 15%)	
 * - Stan ima dva dodatna polja, povrsinaPodruma i povrsinaTerase	
 * - u cenu Stana ulazi i podruma i terase ((povrsinaPodruma + povrsinaTerase) X Zona X 33%)	
 * Napraviti Main klasu i u njoj kreirati instance klae Nekretnina i napraviti objekte izvedenih 
 * klasa sa	proizvoljnim argumentima. Ispisati String repreentaciju objekata - toString().
 */
package zadatak9;

/**
 * @author Radovan.Olujic
 *
 */
public class Main {
	public static void main(String[] args) {

		try {
			Nekretnina kuca = new Kuca("Vidovdanska 52", 1, 120.20,
					new Vlasnik("Petar", "Petrovic", "1312879883632", "113411111"),220.50);
			Nekretnina stan = new Stan("Marsala Tita 103", 2, 52.88,
					new Vlasnik("Ivana", "Ivanovic", "0604998366675", "221222245"), 52.88, 8.22);

			System.out.println(kuca.toString());
			System.out.println(stan.toString());
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
	}
}
