package package1;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Unesite broj sa tastature, a program treba da ispise da li je broj jednocifren, dvocifren, trocifren i veci
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite ceo broj: ");
		int broj = s.nextInt();
		
		if ((broj > 0 && broj < 10) || (broj < 0 && broj > -10)) {
			System.out.println("Broj je jednocifren");
		} else if ((broj >=10 && broj < 100) || (broj <=-10 && broj > -100) ) {
			System.out.println("Broj je dvocifren");
		} else if ((broj >=100 && broj < 1000) || (broj <=-100 && broj > -1000) ) {
			System.out.println("Broj je trocifren");
		} else if ( broj >= 1000 || broj <= -1000) {
			System.out.println("Broj je cetvorocifren ili vise od cetiri cifre");
		} else {
			System.out.println("Broj je nula");
		}
		
		s.close();  
		
	}

}
