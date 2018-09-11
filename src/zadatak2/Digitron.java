/**
 * Napisati program koji ce predstavljati jednostavan digitron. Program treba da radi tako sto
 * korisnik unese dva cela broja, zatim kod operacije koji zeli da izvrsi ('s' - sabiranje, 'o' -
 * oduzimanje, 'm' - mnozenje, 'd' - deljenje). Kao rezultat se ocekuje ispisivanje rezultata
 * te operacije nad unetim operandima.
 *
 */

package zadatak2;

/**
 * @author Radovan.Olujic
 *
 */

import java.util.Scanner;



public class Digitron {
	static Scanner ulaz = new Scanner(System.in);
public static void main(String[] args) {
	
	int prviBroj;
	int drugiBroj;
	String nastavak;
	String operacija;
	
	
	
	while(true) {
		System.out.println("Unesite prvi broj: ");
		prviBroj = unosInt();
		
		System.out.println("Unesite drugi broj: ");
		drugiBroj = unosInt();
		
		System.out.println("Izaberite operaciju: s - sabiranj, o - oduzimanje, m - mnozenje, d - deljenje");
		
		
		operacija = unosString();
		
		
		
		switch (operacija){
			case "s": System.out.println(prviBroj + drugiBroj);
			break;
			case "o": System.out.println(prviBroj - drugiBroj);
			break;
			case "m": System.out.println(prviBroj * drugiBroj);
			break;
			case "d": 
				if(drugiBroj != 0)
				System.out.println(prviBroj / (double)drugiBroj);
				else
					System.out.println("Nije dozvoljeno deljenje sa nulom");
			break;
			default: System.out.println("Pogresno uneta operaciaj!");
			break;
		}
		
		System.out.println("Da li zelite da nastavite sa racunanjem? (da/ne)");
		nastavak = ulaz.next();
		if (nastavak.equalsIgnoreCase("da"))
			continue;
		else {
			System.out.println("Kraj!");
			break;
		}
		
	}
	
	
	
}
private static int unosInt() {
	
	while(!ulaz.hasNextInt())	{
		System.out.println("Pogresan unos! Pokusajte ponovo.");
		ulaz.next();
	}
	return ulaz.nextInt();
		
	}

private static String unosString() {
	
	while(!ulaz.hasNext("[somd]")) {
		System.out.println("Pogresan unos! Pokusajte ponovo.");
		ulaz.next();
	}
	return ulaz.next();
	
}
}
