package javaSusret8;


import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* NAPISATI FUNKCIJU koja racuna broj bodova nekog tima
		Pobeda nosi 4 boda
		Nereseno nosi 2 boda
		Poraz nosi 1 bod
		Ispise izvrsiti iz main metode
				
		Primer resenja
			Unesite broj pobeda:
			3
			Unesite broj neresenih utakmica:
			4
			Unesite broj poraza:
			2
			Ekipa ima 22 bodova */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj pobeda: ");
		int pobede = sc.nextInt();
		
		System.out.println("Unesite broj neresenih utakmica: ");
		int nereseno = sc.nextInt();
		
		System.out.println("Unesite broj poraza: ");
		int porazi = sc.nextInt();
		
		int brojBodova = racunanjeBodova(pobede, nereseno, porazi);
		System.out.println("Ekipa ima " + brojBodova + " bodova.");
		
		sc.close();
		
	}
	
	
	public static int racunanjeBodova(int pobede, int nereseno, int porazi) {
		return (pobede * 4) + (nereseno * 2) + (porazi * 1);
		
	}

	
}
