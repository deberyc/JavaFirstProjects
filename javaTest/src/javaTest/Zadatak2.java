package javaTest;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Napisati program koji racuna potrosnju goriva
		//Korisnik unosi distancu u km i tip vozila, a program ispisuje koliko ce goriva biti potroseno
		
		//Motor trosi 5 litara goriva na 100 kilometara,
		//automobil trosi 7 litara na 100 kilometara,
		//kombi trosi 11 litara na 100km, 
		//dok kamion trosi 15 litara na 100km
		        
		//Primeri ispisa u konzoli:
		        
		//Molim vas unesite distancu u kilometrima:
		//134
		//Molim vas unesite tip vozila: 
		//Kombi
		//Kombi na 134.0 km potrosi 14.74 litara goriva
		//Primer ispisa kad se unese pogresno vozilo
		        
		//Molim vas unesite distancu u kilometrima:
		//133
		//Molim vas unesite tip vozila: 
		//Tenk
		//Uneli ste pogresan tip vozila

		
		
		Scanner s = new Scanner(System.in);
		
		String unosVozila;
		double unosDistance;
		
		System.out.println("Unesite distancu u kilometrima: ");
		unosDistance = s.nextInt();
		
		
		System.out.println("Unesite tip vozila (motor, kombi, automobil ili kamion): ");
		unosVozila = s.next();
		
		
		
		double potrosnjaGoriva = racunanjeDistance(unosVozila, unosDistance);
		System.out.println(unosVozila + " na " + unosDistance + " km potrosi " + potrosnjaGoriva + " litara goriva.");
		
		s.close();
	}
	
	
	
	public static double racunanjeDistance(String tipVozila, double unosKm) {
		double rezultat = 0;
		
		if (tipVozila.equals("motor")) {
			rezultat = (unosKm / 100) * 5;
		} else if (tipVozila.equals("automobil")) {
			rezultat = (unosKm / 100) * 7;
		} else if (tipVozila.equals("kombi")) {
			rezultat = (unosKm / 100) * 11;
		} else if (tipVozila.equals("kamion")) {
			rezultat = (unosKm / 100) * 15;
		} else {
			System.out.println("Uneli ste pogresan tip vozila");
		
		}
		
		return rezultat;
		
		}

}
