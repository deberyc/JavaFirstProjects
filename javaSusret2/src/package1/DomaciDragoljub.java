package package1;

import java.util.Scanner;

public class DomaciDragoljub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Napisati program gde korisnik unese kroz skener neko ime, prezime i broj godina, 
//a program stampa ime, prezime i godinu u kojoj je korisnik rodjen (godiste).
		
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesite ime: ");
		String ime = s.next();
				
		System.out.println("Unesite prezime: ");
		String prezime = s.next();
		
		System.out.println("Unesite godinu rođenja: ");
		int godRodjenja = s.nextInt();
		
		System.out.println("\nIme korisnika je: " + ime + ".\nPrezime korisnika je: " + prezime + 
				".\nGodina rođenja korisnika je: " + godRodjenja); 
		
		s.close();
		
/*Napisati program za prijavu polaganja vozacke dozvole gde korisnik unese kroz skener broj godina 
i program mu vrati jednu od cetiri poruke zavisno od unosa. Ako je korisnik maloletan ispisuje 
"Samo osobe starije od 18 godina mogu imati vozacku dozvolu", ako je korisnik stariji od 65 godina ispisuje 
"Korisnici stariji od 65 godina ne mogu polagati za vozacku dozvolu" i ako korisnik unese neki izmedju broj 
ispisati "Vasa prijava je prihvacena"	*/
		
				
		
		Scanner d = new Scanner (System.in);
		
		System.out.println("Prijava polaganja za vozačku dozvolu. \n\nUnesite broj godina: ");
		
		int brojGodina = d.nextInt();
		if (brojGodina >= 1 && brojGodina < 18) {
			System.out.println("Samo osobe starije od 18 godina mogu imati vozačku dozvolu.");
		}
		else if (brojGodina > 65) {
			System.out.println("Korisnici stariji od 65 godina ne mogu polagati za vozačku dozvolu.");
		}
		else if (brojGodina >=18 && brojGodina <= 65){
			System.out.println("Vasa prijava je prihvaćena.");
		}
		else if (brojGodina <= 0) {
			System.out.println("Greška! Unesite broj godina kao ceo pozitivan broj u rasponu 18-65.");
		}   

	
		d.close();
	}
	
}


