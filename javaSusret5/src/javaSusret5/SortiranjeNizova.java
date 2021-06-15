package javaSusret5;

public class SortiranjeNizova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// sabiranje u nizu
		
		int[] nizBrojeva = {3, 34, 8, 1, 5, 67};
		int zbir = 0;
		for (int i = 0; i < nizBrojeva.length; i++) {
			zbir+=nizBrojeva[i];
		}
		System.out.println("Zbir elemenata niza je " + zbir);
		
// u ovom nizu brojeva ispisite koji je najmanji broj	
		
		int[] nizBrojeva = {3, 34, 8, 1, 5, 67};
		int min = nizBrojeva[0];
		for (int i = 0; i < nizBrojeva.length; i++)
			if (nizBrojeva [i] < min) {
				min = nizBrojeva[i];
			}
		System.out.println(min)
		
		
/*		Napisati program koji svaki element niza
		povecava za vrednost pozicije na kojoj se
		element nalazi. Vrednosti i broj elemenata niza su proizvoljni
		Primer izvrsenja:
		niz = 1, 5, 7, -1, 4
		Nakon izvrsenja programa:
		niz = 1, 6, 9, 2, 8
		Kako je ovaj niz dobijen?
		niz = 1+0, 5+1, 6+2, -1+3, 4+4 */
		
		int [] nizBrojeva = {3, 9, 7, 10, 29, 30, 11};
		System.out.print("Niz pre promene: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.print(nizBrojeva[i] +  ", ");
		}
		System.out.println();
		System.out.print("Niz nakon promene: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva [i]= nizBrojeva[i] + i;
			System.out.print(nizBrojeva[i] +  ", ");
		} 
		
		
		
	}

}
