package javaSusret7;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza		(Sanela)
 // bonus zadatak: napisati dodatnu funkciju koja prima dva niza i vraca sumu svih elemenata iz oba niza		
		
		int[] nizJedan = {2,5,6,4,3,5};
		int [] nizDva= {3,4,6,4,2,4};
		
		int sumElemenataNiza=zbirElemenataNiza(nizJedan);
		System.out.println("Suma brojeva niza je " + sumElemenataNiza);
		int sumaElemenataDvaNiza=zbirElemenataDvaNiza(nizJedan, nizDva);
		System.out.println("Suma brojeva dva niza je " + sumaElemenataDvaNiza);
		
		
	}
	
	
	public static int zbirElemenataNiza(int [] nizIntidzera) {
		int suma=0;
		for (int i = 0; i < nizIntidzera.length; i++) {
			suma=suma+nizIntidzera[i];
		}
		return suma;
	}
	
	
	public static int zbirElemenataDvaNiza(int []prviNiz, int [] drugiNiz) {
		int suma= 0;
		for (int i = 0; i < prviNiz.length; i++) {
			suma+=prviNiz[i];
		}
		for (int i = 0; i < drugiNiz.length; i++) {
			suma+=drugiNiz[i];
		}
		return suma;
	}
	
	
}