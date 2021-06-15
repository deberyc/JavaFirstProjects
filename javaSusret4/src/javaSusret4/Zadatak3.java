package javaSusret4;

import java.util.Scanner;


public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//for petlja 

		for (int i = 0; i <= 5; i++) {
		System.out.println("i je " + i);
		}
		int broj = 0;
		while (i<5) {
			System.out.println("i je " + i);
			i++;
		}
		
		
		
		
//Napisati program koji stampa sve brojeve
//od 25 do 15 pomocu for petlje
		
		for (int i = 25; i >= 15; i--) {
			System.out.print(i + " ");
		}
		

//for sa uslovom i brojacem


		int brojac = 1;
		for (int i = 0; i <= 76; i++) {
			if(i%10==0 && i!=0) {
				System.out.println(brojac + ". Broj koji je deljiv sa 10 je " + i);
				brojac++;
			}
	}
		
		
	//Napisati program koji stampa sve parne
	//brojeve u opsegu od 3 do 33
	
	
	int brojac = 1;
	for (int i = 3; i <= 33; i++) {
	if (i%2==0) {
		System.out.println( brojac+ ") " + i + " je paran broj ");
	brojac++;
	}
	}
	
	
/*	Napisati program koji sabira N brojeva.
	Korisnik unosi N i unosi brojeve.
Primer:
	Unesite koliko brojeva zelimo da saberemo: 5
	Unesite 1. broj: 1
	Unesite 2. broj: 3
	Unesite 3. broj: 4
Unesite 4. broj: 2Unesite 5. broj: 6
	Suma unetih brojeva je 16*/
			
	
	
	Scanner unos = new Scanner(System.in);
	System.out.println("Unesite koliko brojeva zelite da saberete: ");
	int n = unos.nextInt();
	int unetiBroj;
	int suma = 0;
	for (int i = 0; i < n; i++) {
		System.out.println("Unesite " + (i + 1) + ". broj: ");
		unetiBroj = unos.nextInt();
		suma += unetiBroj;
	}
	
	unos.close();
	System.out.println("Suma unetih brojeva je " + suma);
}
	
	
	
		
//	Napisati program koji ucitava N brojeva od korisnika
//		i ispisuje koliko je pozitivnih brojeva uneo.
		
	
    	Scanner scanner = new Scanner (System.in);
		System.out.println("Koliko brojeva zelite da unesete: ");
			
		int ukupanBroj = scanner.nextInt();
		int brojacPozitivnih = 0;
		int broj;
		
		for (int i=1; i <=ukupanBroj; i++) {
			
			System.out.println("Unesite " + i + ". broj: ");
			broj = scanner.nextInt();
			
			if (broj> 0) {
				brojacPozitivnih++;
			}
		} 
		
		System.out.println("Uneli ste " + brojacPozitivnih + " pozitivnih brojeva.");
		
		
		
	}

}
