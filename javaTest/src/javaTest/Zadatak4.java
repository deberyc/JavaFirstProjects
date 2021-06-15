package javaTest;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
		//Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
		//1 evro je 0,0085 dinara
		//1 franak je 0,0093 dinara
		//1 dolar je 0,010 dinara
		//Ispise vrsiti iskljucivo iz main metode
		        
		//Primeri ispisa u konzoli:
		        
		//Molim vas unesite iznos u dinarima: 
		//1200
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//evro
		//1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti
		//Primer ispisa u konzoli kad se unese pogresna valuta
		        
		//Molim vas unesite iznos u dinarima: 
		//123
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//zlato
		//Niste uneli dobru valutu

		Scanner s = new Scanner(System.in);
		
		double unosDinara;
		String unosValute;
				
		System.out.println("Unesite iznos u dinarima: ");
		unosDinara = s.nextInt();
		
		
		System.out.println("Unesite valutu u koju zelite da konvertujete dinare (evro, franak ili dolar): ");
		unosValute = s.next();
		
		
		
		double menjacnica = konverzijaDinara(unosDinara, unosValute);
		System.out.println(unosDinara + " dinara kada se konvertuje u " + unosValute + " iznosi " + menjacnica + " u toj valuti.");
		
		s.close();
		
	}
	
	
	public static double konverzijaDinara(double unosDinara, String tipValute) {
		double rezultat = 0;
		
		if (tipValute.equals("evro")) {
			rezultat = unosDinara * 0.0085;
		} else if (tipValute.equals("franak")) {
			rezultat = unosDinara * 0.0093;
		} else if (tipValute.equals("dolar")) {
			rezultat = unosDinara * 0.010;
		} else {
			System.out.println("Niste uneli odgovarajucu valutu.");
		
		}
		
		return rezultat;
		
		}
	

}
