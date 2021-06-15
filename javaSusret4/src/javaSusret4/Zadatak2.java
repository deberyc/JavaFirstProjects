package javaSusret4;

import java.util.Scanner;


public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	Napisati program koji sabira
		brojeve od 0 do broja koji ste uneli na tastaturi
		i prikazuje sumu (ne u svakom koraku vec samo na na kraju)
		Zbir svih brojeva od 0 do 3 je 6*/
		
		
		
		
       Scanner s = new Scanner (System.in);
		
		System.out.print("Unesite broj do kog zelimo da sabiramo: ");
		int brojDoKogaSabiramo = s.nextInt();
		int zbir = 0;
		int i = 0;
		
		while (i<=brojDoKogaSabiramo) {
			zbir+=i;
			i++;
			
		}
		
					
		System.out.println("Zbir svih brojeva od 0 do " + brojDoKogaSabiramo + " je " + zbir + ".");
		
						
		s.close();
		
	}

}
