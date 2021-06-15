package javaSusret8;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 /* NAPISATI FUNKCIJU koja unetu vrednost distance prebacuje u metre
		1 Yard = 0.9144 metara
		1 Foot = 0.3048 metara
		 1 Inch = 0.0254 metara
		
		 Korisnik unosi distancu i mernu jedinicu
		 Ispis u konzoli se vrsi iz main funkcije
		 Primer resenja:
		 Molim vas unesite distancu:
		 150
		 Molim vas unesite mernu jedinicu (Yard, Foot ili Inch):
		 Yard
		 150 Yard je isto sto i 137.16 metara */
		
								
		System.out.println("Molimo Vas unesite distancu");
		Scanner s = new Scanner(System.in);
		double n = s.nextDouble();
		
		System.out.println("Molimo Vas unesite mernu jedinicu (Yard, Foot ili Inch)");
		String a = s.next();
		Konvertor(n, a);
		
		
		Scanner scanner = new Scanner(System.in);
		
		String unosMerneJedinice;
		double unosBroja;
		
		System.out.println("Unesite mernu jedinicu (yard, foot ili inch): ");
		unosMerneJedinice = scanner.nextLine();
		
		System.out.println("Unesite distancu: ");
		unosBroja = scanner.nextInt();
		
		double preracunataDistanca = preracunavanjeDistance(unosMerneJedinice, unosBroja);
		System.out.println(unosBroja + " " + unosMerneJedinice + " je " + preracunataDistanca + " metara.");
		
		s.close();
		
	}
	
	
	
	public static void Konvertor(double n, String a) {
		
		double iznosUMetrima;
		switch (a) {
		case "Yard": {
			iznosUMetrima = n*0.9144;
			System.out.println(n + " Yard je isto sto i " + iznosUMetrima+ " metara");
			break;
		}
		case "Foot": {
			iznosUMetrima = n*0.3048;
			System.out.println(n + " Foot je isto sto i " + iznosUMetrima+ " metara");
			break;
		}
		case "Inch": {
			iznosUMetrima = n*0.0254;
			System.out.println(n + " Inch je isto sto i " + iznosUMetrima+ " metara");
			break;
		}
		
		default:
		 System.out.println("Niste uneli dobru jedinicu");
		}
			
		
	}
	
	
	
		public static double preracunavanjeDistance(String mernaJedinica, double unos) {
	double rezultat = 0;
	if (mernaJedinica.equals("yard")) {
		rezultat = unos * 0.9144;
	} else if (mernaJedinica.equals("foot")) {
		rezultat = unos * 0.3048;
	} else if (mernaJedinica.equals("inch")) {
		rezultat = unos * 0.0254;
	}
	return rezultat;
	
	}
	
		
	
}
