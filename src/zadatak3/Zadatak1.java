package zadatak3;

import java.util.Scanner;

public class Zadatak1 {
	static int a;
	static int b;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite prvi broj: ");
		a = unosInt();
		System.out.println("Unesite drugi broj: ");
		b = unosInt();
		sc.close();

		if (b < a) {
			System.out.println("Parni brojevi su: ");
			while (b <= a) {

				if (b % 2 == 0) {
					System.out.print(b + " ");
				}
				b++;
			}

		}

		else if (a <= b) {
			System.out.println("Parni brojevi su: ");
			while (a <= b) {

				if (a % 2 == 0) {
					System.out.print(a + " ");
				}
				a++;
			}
		}
	}

	private static int unosInt() {
		while (!sc.hasNextInt()) {
			System.out.println("Pogresan unos! Pokusajte ponovo.");
			sc.next();
		}
		return sc.nextInt();
	}
}
