package package1;

import java.util.Scanner;

public class OstatakDeljenja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 5;
		int b = 3;
		
		System.out.println("Ostatak pri deljenju brojeva " + a + " i " + b + " je " + a%b);
	
//Uneti broj sa tastature i ispisati da li je broj paran ili neparan
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite broj: "); 
		int broj = s.nextInt();
		
		if((broj%2)==0) {
			System.out.println("Broj je paran: "); 
		}else if ((broj%2)!=0) {
			System.out.println("Broj je neparan: ");
		}
			
		s.close();
			
				
		
	}

}
