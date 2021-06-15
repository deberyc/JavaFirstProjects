package javaSusret3;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Sa tastature uneti redni broj od 1 do 7 
//i u zavisnosti od toga ispisati: "Radni dan" (1-5), a za "Vikend" za unose 6 i 7
		
		Scanner d = new Scanner (System.in);
		
		System.out.println("Ispis radne nedelje. \n\nUnesite broj 1-7: ");
		
		int dan = d.nextInt();
		if (dan >= 1 && dan <=5) {
			System.out.println("Radni dan.");
		}
		else if (dan >= 6 && dan <=7) {
			System.out.println("Vikend");
		} 
		
		d.close();
		
	}

	
}
