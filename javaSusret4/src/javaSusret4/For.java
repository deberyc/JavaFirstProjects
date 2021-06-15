package javaSusret4;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

//FOR petlja	



	
		
		for (int i = 0; i <= 5; i++) {     
			System.out.println("i je " + i);
		}
		
		
	
		
/*		int broj = 0; 
		while (i < 5) {
			System.out.println("i je " + i);
			i++;
		}*/
		
		
		
				
//Napisati program koji stampa sve brojeve
//do 25 deljive sa 10
		
		for (int i = 0; i <= 25; i++) {
			if(i%10==0 && i!=0) {
			System.out.println("Broj " + i + " je deljiv sa 10");
			}
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
			
			int brojac2 = 1;
			for (int i = 3; i <=33; i++) 
				if(i%2==0){  
					System.out.println(i + " je paran broj ");
					brojac2++;
				}
					
			
/*Napisati program koji sabira N brojeva.
		Korisnik unosi N i unosi brojeve.
		Primer:
		Unesite koliko brojeva zelimo da saberemo: 5
		Unesite 1. broj: 1
		Unesite 2. broj: 3
		Unesite 3. broj: 4
		Unesite 4. broj: 2
		Unesite 5. broj: 6
		Suma unetih brojeva je 16*/
			
			
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da saberete: ");
		
		int n = s.nextInt();
		int unetiBroj;
		int suma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			unetiBroj=s.nextInt();
			suma += unetiBroj;
		}
		System.out.println("Suma unetih brojeva je " + suma);
		
		s.close();
		
	}
}

