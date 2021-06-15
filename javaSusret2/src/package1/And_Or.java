package package1;

import java.util.Scanner;

public class And_Or {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        //AND => &&
				//OR => ||
		
				int a =0;
				int b = 10;
				
				if(a > 0 && b > 0) {
					System.out.println("Oba broja su pozitivna");
				}else if (a > 0 || b > 0) {
					System.out.println("Jedan broj je pozitivan");
				}else {
					System.out.println("Oba broja su 0 ili negatini");
				}
		
		

		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite broj: "); 
		int x = s.nextInt();
		
		
		if(x >= 0 && x < 10 ) {
			System.out.println(x + " je jednocifren broj");
		}
				else if (x >= 10 && x<=99) {
				System.out.println(x + " je dvocifren broj");}
					else if(x == 0) {
					System.out.println(x + " je nula");}  
		
		
		s.close();
	}

}
