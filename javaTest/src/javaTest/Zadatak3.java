package javaTest;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Napisite program koji, koristeci petlju, racuna zbir unetih brojeva, sve dok korisnik ne unese 0
		//Primer ispisa resenja:
		//Molim vas unesite 1. broj
		//4
		//Trenutni zbir je 4
		//Molim vas unesite 2. broj
		//5
		//Trenutni zbir je 9
		//Molim vas unesite 3. broj
		//0
		//Uneli ste 0 Kraj programa

		
/*	Scanner s = new Scanner(System.in);	
	System.out.println("Racunanje zbiraunetih brojeva.");
		
	int broj = s.nextInt();
	int zbir = 0;
	
	for (int i = 0; i < broj; i++) {
		System.out.println("Unesite " + (i + 1) + ". broj: ");
		broj=s.nextInt();
		zbir += broj;
	}
	System.out.println("Suma unetih brojeva je " + zbir);*/
	
	
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		
		int unetiBroj = s.nextInt();;
		int zbir = 0;
		
		while (unetiBroj != 0) {
		
			System.out.println("Unesite broj: ");
			unetiBroj = s.nextInt();
			zbir += unetiBroj;
		}
		
		System.out.println("\nUnet je broj 0. Kraj programa. Dosadasnji zbir je " + zbir + ".");
		
		
	
		s.close();
	
	
	}
		
	
	
}
