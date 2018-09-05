package zadatak1;

import java.util.Random;
import java.util.Scanner;

public class SlucajanBroj {
	public static void main(String[] args) {

		int broj = 0;
		int slucajanBroj;
		String unetBroj = "";
		String nastavak;

		Random generator = new Random();
		slucajanBroj = generator.nextInt(50) + 1;
		
		Scanner ulaz = new Scanner(System.in);

		while (true) {

			System.out.println("Unesite broj od 1 do 50");
			

			unetBroj = ulaz.next();

			try {
				broj = Integer.parseInt(unetBroj);

				if (51 > broj && 0 < broj) {

					System.out.println("trazeni broj je " + slucajanBroj);
					System.out.println();

					if (broj == slucajanBroj)
						System.out.println("Neverovatno!Pogodili ste tacan broj!");
					else if (5 >= Math.abs(broj - slucajanBroj))
						System.out.println("Dobar pokusaj, bili ste jako blizu!");
					else
						System.out.println("Vise srece sledeci put...");
				} else {
					System.out.println("Broj mora biti od 1 do 50!");
					continue;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Pogresan unos. Morate uneti ceo broj!");

			}

			System.out.println("Da li zelite da nastavite sa igrom? (da/ne)");
			nastavak = ulaz.next();
			
			if (nastavak.equalsIgnoreCase("da"))
				continue;
			else {
				System.out.println("Kraj!");
				break;
				
			}
			
		}
		ulaz.close();
		
	}
}
