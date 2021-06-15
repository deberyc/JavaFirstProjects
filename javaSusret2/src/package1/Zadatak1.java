package package1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati program koji ucitava vrednosti a i b
sa tastature i pronalazi njihovu srednju vrednosti
	I na kraju ispistuje tu vrednost.*/
		
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesite vrednost a: ");
		double a = s.nextDouble();
		System.out.println("Vrednost a koju ste uneli je " + a);
		
		System.out.println("Unesite vrednost b: ");
		double b = s.nextDouble();
		System.out.println("Vrednost b koju ste uneli je " + b);
		
		System.out.println("Srednja vrednost za a i b iznosi " + (a+b)/2);
		
		s.close();
		
	}

}
