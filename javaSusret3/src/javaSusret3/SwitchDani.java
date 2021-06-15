package javaSusret3;

import java.util.Scanner;

public class SwitchDani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Uneti sa tastature reedni broj dana u nedelji
//Program izbacuje koji je to mesec
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite redni broj dana: ");
		
		int redniBrojDanaUNedelji = s.nextInt();
		
		switch (redniBrojDanaUNedelji) {
		case 1: {
			System.out.println("Ponedeljak je");
			break;
		}
		case 2: {
			System.out.println("Utorak je");
			break;
		}
		case 3: {
			System.out.println("Sreda je");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak je");
			break;
		}
		case 5: {
			System.out.println("Petak je");
			break;
		}
		case 6: {
			System.out.println("Subota je");
			break;
		}
		case 7: {
			System.out.println("Nedelja je");
			break;
		}
		default:
			System.out.println("Redni broj dana u nedelji nije validan");
			break;
		}  
		
		s.close();
	}

}
