package javaSusret8;

public class Zadatak1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/* Napraviti niz od 10 brojeva
Napraviti petlju koja ce ispisati elemete niza koji su deljivi sa 3
				
	Primer niza: {9,11,15,23,25,43,78,87,92,3}
		Primer ispisa resenja:
		Elementiu niza koji su deljivi sa 3 su:
			9
			15
			78
			87
			3
		
	bonus zadatak, napravite funkciju koja prima niz, 
	a vraca niz koji sacinjavaju samo element prosledjenog niza koji su deljivi sa 3 */
		
		int[] nizBrojeva = {5, 44, 15, 29, 100, 66, 17, 80, 42, 11};
		System.out.println("Brojevi deljivi sa 3 su: " );
		
		for (int i = 0; i < nizBrojeva.length; i++)	{
			if(nizBrojeva[i]%3==0) {
				System.out.println(nizBrojeva[i] + " ");	
			}
				
				
			}
		
		int[] nizDva = {5, 7, 9, 15, 34};
		System.out.println("Elementi niza dva koji su deljivi sa 3 su: ");
		int[] vracenoIzFunkcije = vracanjeNizaBrojevaDeljivihSaTri(nizDva);
		for (int i = 0; i < vracenoIzFunkcije.length; i++)	{
			System.out.println(vracenoIzFunkcije[i]);
	}
		
	
		
}
				
	
	
		public static int[] vracanjeNizaBrojevaDeljivihSaTri(int[] primljenNiz) {
			int[] nizBrojevaDeljivihSaTri;
			int brojac = 0;
			for (int i = 0; i < primljenNiz.length; i++) {
				if(primljenNiz[i]%3==0) {
					brojac+=1;
				}
			}
			
			nizBrojevaDeljivihSaTri = new int [brojac];
			int index = 0;
			for (int i = 0; i < primljenNiz.length; i++) {
				if(primljenNiz[i]%3==0) {
					nizBrojevaDeljivihSaTri[index] = primljenNiz[i];
					index+=1;
				}
			}
			return nizBrojevaDeljivihSaTri;
		
	}		
		
	
}
