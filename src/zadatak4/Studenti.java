package zadatak4;

import java.util.Scanner;

public class Studenti {
	static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	int brojStudenata;
	String ime;
	int ocena;
	
	
	
	System.out.println("Unesite broj studenata: ");
	brojStudenata = unosInt();
	
	int maxOcena = 0;
	String imeNajStudenta = "";
	for (int i = 0; i < brojStudenata; i++) {
		System.out.print("Unesite ime studenta: ");
		ime = unosImena();
		System.out.print("Unesite ocenu studenta: ");
		ocena = unosInt();
		if(ocena > maxOcena) {
			maxOcena = ocena;
			imeNajStudenta = ime;
		}
	}
	System.out.println("Student sa najvecom ocenom je " + imeNajStudenta 
			+ ", sa ocenom: " + maxOcena );
}
private static int unosInt() {

	while (!sc.hasNextInt()) {
		System.out.println("Pogresan unos! Pokusajte ponovo.");
		sc.next();
	}
	return sc.nextInt();

}
private static String unosImena() {
	
	
	String ime = "" ;
	while (!ime.matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$")) {
		if (!ime.equals("")) {
			System.out.print("Pogresan unos! - Molimo unesite ime studenta: ");
		}
		ime = sc.nextLine();
		
	}
	return ime;		
}

}
