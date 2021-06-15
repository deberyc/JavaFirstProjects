package javaSusret3;

import java.util.Scanner;

public class DomaciAca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*	 Napisati program koji od korisnika trazi unos broja dana u jednom mesecu 
	i da za rezultat ispise koliko meseci u godini ima toliko dana.
	Primer. korisnik unese 31 a program vrati rezultat "7 meseci u godini ima 31 dan"*/
	
		
		
		System.out.println("Unesite ukupan broj dana u jednom mesecu: ");
		Scanner s = new Scanner(System.in);
		int brojDana = s.nextInt();
		
		if (brojDana == 31) {
			System.out.println("7 meseci u godini ima 31 dan.");
		}
		else if (brojDana == 30) {
			System.out.println("4. meseca u godini ima 30 dana.");
		}
		else if (brojDana == 28 || brojDana == 29) {
			System.out.println("1. mesec u godini ima 28/29 dana.");
		}
		else {
			System.out.println("Nevalidan ukupan broj dana.");
		}
		
		
		

/*		Napisati program koji od korisnika trazi da unese dan u celoj godini 
		a da za rezultat dobije kojoj nedelji pripada taj dan u godini.
		Primer. korisnik unese 75 a program kao rezultat vrati "11. nedelja u godini"
		Napomena: Racunajte da je prvi dan u godini ponedeljak.*/
		
		System.out.println("Unesite konkretan dan u godini u opsegu 1-365: ");
	//	Scanner s = new Scanner(System.in);
		
		int dan = s.nextInt();
		int nedeljaGranica = 7; 
		int brojacNedelja = 1; 
		
		if (dan <=0 || dan >365) {
			System.out.println("Uneti dan nije validan.");
		}
		
				
		  else { 	
			
				while(dan > nedeljaGranica) {
				
				nedeljaGranica+=7;
				brojacNedelja++;
		 		}
		
				System.out.println(brojacNedelja + ". nedelja u godini.");		
													
		 } 
		
		
		
		
//		  Scanner s = new Scanner (System.in);
		  System.out.print("Unesite zeljeni broj dana u godini: ");
		  int broj = s.nextInt();
		  int nedelja = broj/7;
		  
		  if ( broj  <= 0 || broj > 366 ){
			   System.out.print("Unet broj ne predstavlja odgovarajuci broj dana u godini");
		  }
		  else if ( broj%7 == 0 ){System.out.println(nedelja + ". nedelja u godini ");
		  }
		  else if (broj%7 != 0){System.out.println(nedelja + 1 + ". nedelja u godini ");
		  }  
	
		
// Ukupno brojeva od 9 do 250 deljivih sa 3
		  
		int brojac = 0;
		int i = 9;
		
		for(i = 9; i <=250; i++) {
			if (i%3==0)
				System.out.println("Broj " + i + " je deljiv sa 3.");
			brojac++;
		}
			
		System.out.println("\nUkupno brojeva od 9 do 250 deljivih sa 3 ima " + brojac + ".");
			
		
/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1, program treba da ispise 11
Ne treba da traži koliko će brojeva biti uneseno, unos se prekida kada se unese negativan broj*/
		
		
	
//		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		
	//	int brojac = 0;
		int zbir = 0;
		int brojx = 0; // od nekog broja mora da krene sabiranje
		
		brojx = s.nextInt();
		
		
		
		while (brojx >= 0)
		{
			System.out.println("Unesite broj: ");
	//	    brojac++;
		    zbir +=brojx;

		    brojx = s.nextInt();
		}
		
		System.out.println("Zbir unetih brojevaje: " + zbir);
		
		s.close();
		
	}
	
	
	
}
