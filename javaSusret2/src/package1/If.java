package package1;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 56;
		if(a > 15) {
			System.out.println(a + " je vece od 15");
			System.out.println("i ovo je napisano");
		}else if (a < 15) {
			System.out.println(a + " je manje od 15");
		}else   {                                          // else if (a == 15)
			System.out.println(a + " je jednako sa 15");
		}
		
		
		
//	Uneti broj sa tastature i ispisati da li je pozitivan, negativan ili jednak nuli.
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite broj: "); 
		int x = s.nextInt();
		
		if(x > 0) {
		System.out.println(x + " je pozitivan broj");}
			else if (x < 0) {
			System.out.println(x + " je negativan broj");}
				else if(x == 0) {
				System.out.println(x + " je nula");}
		
		s.close();	
	}

}
