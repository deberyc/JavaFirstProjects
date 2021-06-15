package javaSusret3;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Za uneti dan u nedelji, programi izbacuje
//tekst koji je to dan u nedelji.
						
		
		
		System.out.println("Unesite dan u nedelji: ");
		Scanner s = new Scanner(System.in);
		String danUNedelji = s.next();
		
		switch (danUNedelji) {
		case "Ponedeljak": {
			System.out.println(danUNedelji + " je 1. dan u nedelji");
			break;
		}
		case "Utorak": {
			System.out.println(danUNedelji + " je 2. dan u nedelji");
			break;
		}
		case "Sreda": {
			System.out.println(danUNedelji + " je 3. dan u nedelji");
			break;
		}
		case "Cetvrtak": {
			System.out.println(danUNedelji + " je 4. dan u nedelji");
			break;
		}
		case "Petak": {
			System.out.println(danUNedelji + " je 5. dan u nedelji");
			break;
		}
		case "Subota": {
			System.out.println(danUNedelji + " je 6. dan u nedelji");
			break;
		}
		case "Nedelja": {
			System.out.println(danUNedelji + " je 7. dan u nedelji");
			break;
		}
		default:{
			System.out.println("Nevalidan unos");
			break;
			}
		}
		
		
								
		
		
//	Napisati program koji na osnovu vaseg unosa stringa opisuje godisnje doba
//	Primer: uneli ste Zima a program je ispisao Zima je hladna i tada uglavnom pada	
		
		
		System.out.println("Unesite godišnje doba: ");
	//	Scanner s = new Scanner(System.in);
		String doba = s.next();
		
		switch (doba) {
		case "Zima": {
			System.out.println(doba + " je hladna i snegovita.");
			break;
		}
		case "Proleće": {
			System.out.println(doba + " je period kada se priroda budi.");
			break;
		}
		case "Leto": {
			System.out.println(doba + " je najsunčanije godišnje doba.");
			break;
		}
		case "Jesen": {
			System.out.println(doba + " je u žutim nijansama.");
			break;
		}
		
		default:{
			System.out.println("Pogrešan unos");
			break;
			}
		}
		
		if (doba.equals("Leto"))  //Poređenje stringova sa EQUALS
	    {
	      System.out.println("U petlji smo leto.");
	    }
	    s.close();  
		
	}

}
