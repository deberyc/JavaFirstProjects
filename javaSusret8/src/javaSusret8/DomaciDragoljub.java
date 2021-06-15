package javaSusret8;

import java.util.Scanner;

public class DomaciDragoljub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Napisati program gde korisnik unese redni broj dana u godini (1-365) 
// i program vrati odgovor koji je to dan u nedelji. Podjimo od pretpostavke da je 1. januar ponedeljak.
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite redni broj dana u godini (1-365): ");
				
		 int redniBrojDana = s.nextInt();
		 
		 int pon;
				 
		 int uto;
		 
		 int sre;
		 
		 int cet;
		 
		 int pet;
		 
		 int sub;
		 
		 int ned;
		 		 
				 
						 
		 
		 if ( redniBrojDana  <= 0 || redniBrojDana > 365 ){
			   System.out.print("Uneti broj ne predstavlja odgovarajuci redni broj dana u godini.");
		 }
				
		for(pon=1; pon<=365; pon+=7) {
			if(redniBrojDana==pon) {
				System.out.println("\n" + pon + ". dan u godini je ponedeljak.");
			}
				
		 }
		 
		for(uto=2; uto<=365; uto+=7) {
			if(redniBrojDana==uto) {
				System.out.println(uto + ". dan u godini je utorak.");
			}
		 }
		  
		for(sre=3; sre<=365; sre+=7) {
			if(redniBrojDana==sre) {
				System.out.println(sre + ". dan u godini je sreda.");
			}
		 }
	
		for(cet=4; cet<=365; cet+=7) {
			if(redniBrojDana==cet) {
				System.out.println(cet + ". dan u godini je četvrtak.");
			}
		 }
	
		for(pet=5; pet<=365; pet+=7) {
			if(redniBrojDana==pet) {
				System.out.println(pet + ". dan u godini je petak.");
			}
		 }
		
		for(sub=6; sub<=365; sub+=7) {
			if(redniBrojDana==sub) {
				System.out.println(sub + ". dan u godini je subota.");
			}
		 }
		
		for(ned=7; ned<=365; ned+=7) {
			if(redniBrojDana==ned) {
				System.out.println(ned + ". dan u godini je nedelja.");
			}
	
		}
		
		boolean suma = zbirPrvaDvaBrojaJeTreci(5,8,13);
		System.out.println("Treći broj je zbir prva dva broja? " + suma);
		
		
}
	
	
	
/* Napisati funkciju koja za parametre prima tri broja num1, num2 i num3 i proverava 
da li je zbir num1 i num2 jednak num3.
Primer:    Ako se unese num1 = 2, num2 = 4, i num3 = 99 vraca false
	        Ako se unese num1 = 2, num2 = 4, i num3 = 6 vraca true	*/
			
			
	
	
	public static boolean zbirPrvaDvaBrojaJeTreci(int num1, int num2, int num3) {
		boolean zbirovi;
		if (num1+num2==num3) {
			zbirovi = true;
		}
		else {
			zbirovi = false;
		}
		return zbirovi;
	}
	
	
	
}