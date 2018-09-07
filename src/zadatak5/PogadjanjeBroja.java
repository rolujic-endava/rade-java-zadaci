/*Uraditi modifikaciju domaceg iz predhodne nedelje. Vrteti se u petlji dok ne pogodimo broj, 
 * ili budemo barem blizu (razlika manja od 5). Taj deo sa proverom pogodtka izdvojiti u zasebnu
 *  metodu, kojoj se kao argument prosledjuje broj koji tipujemo, a povratna vrednost metode je 
 *  0 - ako smo pogodili, 1 - ako smo bili blizu,2 - ako smo promasili. Na osnovu toga ostajemo
 *  ili izlazimo iz petlje i zavrsavamo program sa odgovarajucom porukom.
 */

/**
 * @author Radovan.Olujic
 *
 */

package zadatak5;

import java.util.Random;


import java.util.Scanner;

public class PogadjanjeBroja {

	public static Scanner ulaz = new Scanner(System.in);
	public static Random r; 
	public static int broj;
	public static int ishod;
	public static int slucajanBroj;
	
	public static void main(String[] args) {
		
		while (true) { 
			broj = unosBroja();
			ishod = proveraPogotka(broj);
			
			if(ishod == 2)
				continue;
			
			System.out.println("--- Kraj programa ---");
			break;			
		}
		ulaz.close();
	}
	
	
	private static int unosBroja() {
		int br;
		
		do {
			System.out.println("Unesite broj od 1 do 50: ");
		    while (!ulaz.hasNextInt()) {			    	
		        System.out.print("Molimo unesite broj!!! Broj: ");
		        ulaz.next(); 			    			    	
		    }
		    br = ulaz.nextInt();			    
		} while (br <= 0 || br > 50);
		
		return br;
	}
	
	private static int proveraPogotka(int unetiBroj) {
		r = new Random();
		slucajanBroj = r.nextInt(50) + 1;
		System.out.println("Slucajno generisan broj: " + slucajanBroj);
		
		if (slucajanBroj == unetiBroj) {
			System.out.println("Neverovatno! Pogodili ste tacan broj!");
			return 0;
		} else if (5 >= Math.abs(broj-slucajanBroj)) {
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
			return 1;
		} else {
			System.out.println("Vise srece drugi put...");
			return 2;
		}
	}
	
}

