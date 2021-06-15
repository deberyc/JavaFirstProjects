package javaSusret6;

import java.util.Scanner;

public class DomaciDragoljub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati program gde korisnik unese ime, prezime i pol (preko void metode) a main metoda stampa i vraca
"Dobrodosao u IT" ili "Dobrodosla u IT" zavisno koji pol unese */
		
		dobrodoslica("Janko", "Janković", "m");
		dobrodoslica("Maja", "Marković", "z"); 
		
		
/*Napisati program gde korisnik preko skenera unese brojeve od 1 do 10 (ukljucujuci 1 i 10) 
i program mu vrati odgovor da li je broj prost ili ne. (Prost broj je onaj koji je deljiv samo sa brojem 1 i sa sobom) */
				
				
		
/*			System.out.println("Unesite broj: ");
					Scanner s = new Scanner(System.in);

					int broj = s.nextInt();
					prostiBrojevi(broj); */

					
		
	}
	
	
		public static void prostiBrojevi(int unos) {  
			  int brojac = 0;
				for(int i = 1; i <= unos; i++) {
					if(unos % i == 0 ) {
				              brojac++;	        
				              }
			               }
			
			  if (unos < 1 || unos > 10) 
				System.out.println("Pogresan unos, pokusajte ponovo!");
				
			  else if (brojac==2)
				System.out.println("Jeste prost broj.");
			  else
				System.out.println("Nije prost broj.");       
	                 } 

	  
	  
	
	public static void dobrodoslica(String ime, String prezime, String pol) {
		
		if (pol.equals("m") ) {
			System.out.println("Dorodošao u IT.");
		} else {
			System.out.println("Dorodošla u IT.");
		} 
	
	} 
	
}


