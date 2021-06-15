package javaSusret4;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*Uneti dva broja s tastature (prvi je manji, drugi je veci) 
i napraviti while petlju koja ispisuje
sve brojeve izmedju ukljucujuci i granicne vrednosti
 ako se unesu 4 i 8 ispisace se 4 5 6 7 8*/
		
        Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite manji broj: ");
		int manjiBroj = s.nextInt();
		
		System.out.print("Unesite veci broj: ");
		int veciBroj = s.nextInt();
		
		if ((veciBroj - manjiBroj) <= 0) {
			System.out.println("Pogresan unos, pokusajte ponovo!");
			
		}
		
		while (manjiBroj <= veciBroj) {
		
			System.out.print(manjiBroj);
			manjiBroj++;
		}
		System.out.println("\nKraj programa.");
		 
		s.close();
		
	}

}
