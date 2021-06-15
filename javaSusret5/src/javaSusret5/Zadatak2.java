package javaSusret5;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati program koji sabira brojeve od korisnika sve dok
korisnik ne unese dva ista broja zaredom. Smatrati da korisnik unosi
brojeve vece od nule.
Primer:
Unesite broj: 1
Unesite broj: 3
Unesite broj: 5
Unesite broj: 7
Unesite broj: 2
Unesite broj: 2
Suma je 20*/
		
		
		Scanner s = new Scanner(System.in);
		int unetiBroj = 0;
		int brojZaProveru = -1;
		int suma = 0;
		
		while (brojZaProveru != unetiBroj) {
			brojZaProveru = unetiBroj;
			System.out.println("Unesite broj");
			unetiBroj = s.nextInt();
			suma += unetiBroj;
		}
		
		System.out.println("Uneli ste dva ista broja. Suma je " + suma);
		
		s.close();	
	}
	}

