package package1;

import java.util.Scanner;

public class CitanjeSaTastature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesite prvi broj: ");
		int prviBroj = s.nextInt();
		System.out.println("1. Broj koji ste uneli je " + prviBroj);
		
		System.out.println("\nUnesite drugi broj: ");
		int drugiBroj = s.nextInt();
		System.out.println("2. Broj koji ste uneli je " + drugiBroj);
		
		System.out.println("\nZbir unetih brojeva iznosi: " + (prviBroj + drugiBroj));
		
		
		
		
//		Scanner s = new Scanner (System.in);
		System.out.println("Unesite prvi decimalni broj: ");
		double doubleBroj = s.nextDouble();
		System.out.println("1. decimalni broj je " + doubleBroj);
	
//		Scanner s = new Scanner (System.in);
		System.out.println("\nUnesite prvi string: ");
		String prviString = s.next(); // nextLine za dve reči
		System.out.println("Prvi uneti String je: " + prviString);
		
		
//		Scanner s = new Scanner (System.in);
		System.out.println("Unesite prvi float: ");
		float prviFloat = s.nextFloat();
		System.out.println("Prvi uneti float borj " + prviFloat);
		
//		Scanner s = new Scanner (System.in);
		System.out.println("Unesite prvi boolean: ");
		boolean prviBoolean = s.nextBoolean();
		System.out.println("Prvi uneti boolean je: " + prviBoolean);
		
		s.close();
		
	}

}
