package javaSusret3;

import java.util.Scanner;

public class SwitchMeseci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Uneti sa tastature redni broj meseca u godini. Program treba da ispise koji je to mesec 
//  i koliko ima dana u njemu. Primer ispisa: 1. mesec u godini je Januar. U njemu ima 31 dan	
		
		
		System.out.println("Unesite redni broj meseca: ");
		Scanner s = new Scanner(System.in);
		
		int redniBrojMeseca = s.nextInt();
		switch (redniBrojMeseca) {
		case 1: {
			System.out.println("1. mesec u godini je januar. U njemu ima 31 dan;");
			break;
		}
		case 2: {
			System.out.println("2. mesec u godini je februar. U njemu ima 28/29 dana.");
			break;
		}
		case 3: {
			System.out.println("3. mesec u godini je mart. U njemu ima 31 dan.");
			break;
		}
		case 4: {
			System.out.println("4. mesec u godini je april. U njemu ima 30 dana.");
			break;
		}
		case 5: {
			System.out.println("5. mesec u godini je maj. U njemu ima 31 dan.");
			break;
		}
		case 6: {
			System.out.println("6. mesec u godini je jun. U njemu ima 30 dan");
			break;
		}
		case 7: {
			System.out.println("7. mesec u godini je jul. U njemu ima 31 dan.");
			break;
		}
		case 8: {
			System.out.println("8. mesec u godini je avgust. U njemu ima 31 dan.");
			break;
		}
		case 9: {
			System.out.println("9. mesec u godini je septembar. U njemu ima 30 dana.");
			break;
		}
		case 10: {
			System.out.println("10. mesec u godini je oktobar. U njemu ima 3o dana.");
			break;
		}
		case 11: {
			System.out.println("11. mesec u godini je novembar. U njemu ima 30 dana.");
			break;
		}
		case 12: {
			System.out.println("12. mesec u godini je decembar. U njemu ima 31 dan.");
			break;
		}
				default:
			System.out.println("Redni broj meseca nije validan");
			break;
					
			
	}
		
		s.close();

}
}