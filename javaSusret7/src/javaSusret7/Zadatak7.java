package javaSusret7;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza	(moje)
// bonus zadatak: napisati dodatnu funkciju koja prima dva niza i vraca sumu svih elemenata iz oba niza
		
		int[] niz = {1,2,3,4,5}; //pošto prima niz, ovde se inicijalizuje niz
		int[] drugiNiz = {2,3,4};
		
		System.out.println("Suma svih članova prvog niza je " + SumaNiza(niz));
				
		System.out.println("Suma svih članova iz oba niza je: " + SumaDvaNiza(niz, drugiNiz));
		
		
	}
	
	
	public static int SumaNiza(int[] nizBrojeva) {  //ovde prima niz, a vraća broj
		int suma = 0;
		for (int i = 0; i < nizBrojeva.length; i++) {
			suma += nizBrojeva[i];
		}
		
		return suma;
	}
	
	
	public static int SumaDvaNiza(int[] prviNiz, int[] drugiNiz) {
		int suma = SumaNiza(prviNiz) + SumaNiza(drugiNiz);		
		return suma;
	}
	
}