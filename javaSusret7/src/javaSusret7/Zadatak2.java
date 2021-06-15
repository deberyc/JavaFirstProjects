package javaSusret7;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	Funkcija kao parametre prima osnovu i stepen, a za rezultat
		vraca sracunatu vrednost.

	Primer: stepen(10, 4) ima za rezultat 10000
	Primer: stepen(2, 3) ima za rezultat 8 */
		
		
		
		int osnova=5;
		int stepen=2;
		int rezultat=stepenovanje(osnova,stepen);
		System.out.println("Osnova " + osnova + ", stepen " + stepen + ", ima za rezultat " +rezultat);
		
		
	}
	
	
	public static int stepenovanje(int osnova, int stepen) {
		int rezultat=1;
		for (int i = 1; i <= stepen ; i++) {
			rezultat=rezultat*osnova;
		 // osnova*=osnova;
			
			
		}
	return rezultat;
	
	
	}
	
		
	
}
