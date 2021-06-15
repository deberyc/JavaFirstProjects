package javaSusret8;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* korisnik unosi dan u nedelji, ako pogresi unos ispisite gresku
napisite program koji ce nam reci u kom mestu je ringispil i koje mu je radno vreme
ringispil radnim danima radi od 09-15h, a vikendom od 10 do 21h
raspored po mestima je pon, utorak i subota: Novi Sad
sre i cet: Temerin
pet i ned: Kac
		
		Primer resenja:
		Molim vas unesite dan u nedelji:
		Utorak
		ringispil je utorkom u Novom Sadu, a radno vreme mu je 09-15h */
		
		System.out.println("Unesite dan u nedelji: ");
		Scanner s = new Scanner(System.in);
		
		String danUnedelji = s.next();
		String radnoVreme = " od 9h do 15h ";
		String radnoVremeVikend = " od 10h do 21h ";
		
		switch (danUnedelji) {
		case "ponedeljak": {
			System.out.println(" Ringispil je ponedeljkom u Novom Sadu, a radno vreme mu je " + radnoVreme + ".");
			break;
		}
		case "utorak": {
			System.out.println(" Ringispil je utorkom u Novom Sadu, a radno vreme mu je " + radnoVreme + ".");
			break;
		}
		case "sreda": {
			System.out.println(" Ringispil je sredom u Temerinu, a radno vreme mu je " + radnoVreme + ".");
			break;
		}
		case "cetvrtak": {
			System.out.println(" Ringispil je cetvrtkom u Temerinu, a radno vreme mu je " + radnoVreme + ".");
			break;
		}
		case "petak": {
			System.out.println(" Ringispil je utorkom u Kacu, a radno vreme mu je " + radnoVreme + ".");
			break;
		}
		case "subota": {
			System.out.println(" Ringispil je subotom u Novom Sadu, a radno vreme mu je " + radnoVremeVikend + ".");
			break;
		}
		case "nedelja": {
			System.out.println(" Ringispil je nedeljom u Kacu, a radno vreme mu je " + radnoVremeVikend + ".");
			break;
		}
		default: {
			System.out.println("Niste uneli dobar dan.");
		}
		}
		
		
		s.close();
		
	   }
		
	}

	
	

