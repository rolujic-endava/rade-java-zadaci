package zadatak2;

import java.util.Scanner;



public class Digitron {
	static Scanner ulaz = new Scanner(System.in);
public static void main(String[] args) {
	
	int prviBroj1;
	int drugiBroj;
	String nastavak;
	String operacija;
	
	
	
	while(true) {
		System.out.println("Unesite prvi broj: ");
		prviBroj1 = unosInt();
		
		System.out.println("Unesite drugi broj: ");
		drugiBroj = unosInt();
		
		System.out.println("Izaberite operaciju: s - sabiranj, o - oduzimanje, m - mnozenje, d - deljenje");
		
		
		operacija = unosString();
		
		
		
		switch (operacija){
			case "s": System.out.println(prviBroj1 + drugiBroj);
			break;
			case "o": System.out.println(prviBroj1 - drugiBroj);
			break;
			case "m": System.out.println(prviBroj1 * drugiBroj);
			break;
			case "d": 
				if(drugiBroj != 0)
				System.out.println(prviBroj1 / (double)drugiBroj);
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
