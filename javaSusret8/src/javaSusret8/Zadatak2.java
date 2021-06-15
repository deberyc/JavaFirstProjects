package javaSusret8;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* napravite petlju koja sabira elemente niza
 sve dok dok je zbir manji od 200
u svakom prolazu ispisite trenutni zbir i koliko nam fali do 200
ako zbir svih elemenata ne predje 200 ispisite:
"Zbir elemenata niza je manji od 200"
				
				primer niza (kada je zbir elemenata veci od 200): {2,8,-5,16,31,67,8,88,99,2,3,2,5,7,5}
				primer resenja (kada je zbir elemenata VECI od 200):
				Dodajemo 1 elemenat niza: 2 trenutni zbir je 2, a do 200 nam je ostalo 198
				Dodajemo 2 elemenat niza: 8 trenutni zbir je 10, a do 200 nam je ostalo 190
				Dodajemo 3 elemenat niza: -5 trenutni zbir je 5, a do 200 nam je ostalo 195
				Dodajemo 4 elemenat niza: 16 trenutni zbir je 21, a do 200 nam je ostalo 179
				Dodajemo 5 elemenat niza: 31 trenutni zbir je 52, a do 200 nam je ostalo 148
				Dodajemo 6 elemenat niza: 67 trenutni zbir je 119, a do 200 nam je ostalo 81
				Dodajemo 7 elemenat niza: 8 trenutni zbir je 127, a do 200 nam je ostalo 73
				Ako dodamo 8. element niza: 88 Zbir ce preci 200 za 15
				
				primer niza (kada je zbir elemenata manji od 200): {1,8,-5,1,1,1,8,1,1,2,3,2,5,7,5}
				primer resenja (kada je zbir elemenata MANJI od 200):
				Dodajemo 1 elemenat niza: 1 trenutni zbir je 1, a do 200 nam je ostalo 199
				Dodajemo 2 elemenat niza: 8 trenutni zbir je 9, a do 200 nam je ostalo 191
				Dodajemo 3 elemenat niza: -5 trenutni zbir je 4, a do 200 nam je ostalo 196
				Dodajemo 4 elemenat niza: 1 trenutni zbir je 5, a do 200 nam je ostalo 195
				Dodajemo 5 elemenat niza: 1 trenutni zbir je 6, a do 200 nam je ostalo 194
				Dodajemo 6 elemenat niza: 1 trenutni zbir je 7, a do 200 nam je ostalo 193
				Dodajemo 7 elemenat niza: 8 trenutni zbir je 15, a do 200 nam je ostalo 185
				Dodajemo 8 elemenat niza: 1 trenutni zbir je 16, a do 200 nam je ostalo 184
				Dodajemo 9 elemenat niza: 1 trenutni zbir je 17, a do 200 nam je ostalo 183
				Dodajemo 10 elemenat niza: 2 trenutni zbir je 19, a do 200 nam je ostalo 181
				Dodajemo 11 elemenat niza: 3 trenutni zbir je 22, a do 200 nam je ostalo 178
				Dodajemo 12 elemenat niza: 2 trenutni zbir je 24, a do 200 nam je ostalo 176
				Dodajemo 13 elemenat niza: 5 trenutni zbir je 29, a do 200 nam je ostalo 171
				Dodajemo 14 elemenat niza: 7 trenutni zbir je 36, a do 200 nam je ostalo 164
				Dodajemo 15 elemenat niza: 5 trenutni zbir je 41, a do 200 nam je ostalo 159 
				Zbir elemenata niza je manji od 200 */
		
		
			int[] nizBrojeva = {2,10, 15, 4, 8, 9, 22, 13};
		
			int zbir = 0;
			
			
			for (int i = 0; i < nizBrojeva.length; i++) {
				zbir=zbir+nizBrojeva[i];
				
				if(zbir < 200){
				System.out.println("Dodajemo " + (i+1) + ". element niza, trenutni zbir je " + zbir + ", a do 200 nam je ostalo " + (200-zbir) + ".");
				} else if (zbir > 200) {
				System.out.println("Dodajemo " + (i+1) + ". element niza, trenutni zbir je " + zbir + ", a zbir je presao 200 za "
						+ (200-zbir) * -1 + ".");		
				} else{
					System.out.println("Dodajemo " + (i+1) + ". element niza, trenutni zbir je jednak tacno 200.");
				}
				
			 }
			 if(zbir < 200){
				System.out.println("\nZbir elemenata niza je manji od 200.");
			}
		
		
		
		int[] niz = { 2, 22, 24, 1, 6, 17, 1, 3, 4, 31, 11, 7, 5, 24, 42 };
		int zbir = 0;
		int ostatak = 0;
		for (int i = 0; i < niz.length; i++) {
			zbir += niz[i];
			ostatak = 200 - zbir;
			if (zbir < 200) {
				System.out.println("Dodajemo " + (i + 1) + " elemenat niza: " + niz[i] + " trenutni zbir je " + zbir
						+ ", a do 200 nam je ostalo " + ostatak);
			} else if (zbir > 200) {
				System.out.println("Ako dodamo " + (i + 1) + " element niza " + niz[i] + " zbir ce preci 200 za "
						+ (ostatak * -1));
				break;
			} else {
				System.out.println("Ako dodamo " + (i + 1) + " element niza zbir je jednako 200");
			}
		}
		if (zbir < 200) {
			System.out.println("Zbir elemenata niza je manji od 200");
		}
		
		
			 
			 } 
			
	}

	

