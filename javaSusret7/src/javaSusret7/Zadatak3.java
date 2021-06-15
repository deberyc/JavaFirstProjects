package javaSusret7;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/* Napisti funkciju koja za broj n,
vraca poslednju cifru.
Primer:
Ako se prosledi n=3290329, ona vrati 9 */
		
		int unos = -127;
		
		System.out.println("Poslednja cifra je: " + poslednjaCifra(unos));
		
	}

	
	
	public static int poslednjaCifra (int n) {
		
		int rezultat = n%10;
		if (rezultat < 0) {
			rezultat*=-1;
		}
		return rezultat;
		}
	
	
}
	
	

