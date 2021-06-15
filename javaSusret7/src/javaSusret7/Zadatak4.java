package javaSusret7;

public class Zadatak4 {

	

		
		static boolean jednocifren = false;
		public static void main(String[] args) {
	// TODO Auto-generated method stub
			
	//Napisti funkciju koja za broj n,
	//vraca poslednju cifru.
	//Primer:
	//Ako se prosledi n=3290329, ona vrati 9
			
			//bonus zadatak: funkcija koja vraca pretposlednji broj
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Unesite bilo koji broj: ");
			int biloKojiBroj = s.nextInt();
			System.out.println("Broj koji ste uneli je " + biloKojiBroj + ".");
			int poslednjiBroj = vracanjePoslednjeCifre(biloKojiBroj);
			System.out.println("Poslednja cifra broja: " + biloKojiBroj + " je " + poslednjiBroj);
			int pretposlednjiBroj = vracanjePretposlednjeCifre(biloKojiBroj);
			
			if (jednocifren = false) {
				System.out.println("Pretposlednja cifra broja: " + biloKojiBroj + " je " + pretposlednjiBroj);
			}
			
			
		}
		public static int vracanjePoslednjeCifre(int n) {
			int poslednjiBroj = n % 10;
			if (poslednjiBroj < 0) {
				poslednjiBroj *= -1;
			}
			return poslednjiBroj;
		}
		public static int vracanjePretposlednjeCifre(int n) {
			if (n < 0) {
				n *= -1;
			}
			if (n < 10) {
				System.out.println("Broj je jednocifren i nema pretposlednju cifru.");
				jednocifren = true;
			}
			int pretposlednjaCifra;
			int poslednjaCifra = vracanjePoslednjeCifre(n);
			int brojUDeseticama = n - poslednjaCifra;
			int bezPoslednjeCifre = brojUDeseticama / 10;
			pretposlednjaCifra = vracanjePoslednjeCifre(bezPoslednjeCifre);
			return pretposlednjaCifra;
		
		
		
			
		
		
		
		
	}
		

}
