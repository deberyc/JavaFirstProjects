package zadatak3;

public class VisaKartica extends PlatnaKartica {
	
/*	Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
 * 
	� ovlasceno lice, cuva se ime i prezime osobe koja ima ovlascenje da
	podize novac u ekspozituri.
	� getter i setter za ovlasceno lice
	� konstruktor sa parametrima
	
	� implementira metodu izvrsiTransakciju, tako da na prosledjenu sumu
	dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
	
	� implementira metodu koja stampa podatke o kartici u formatu:
	Visa Card: 4012-1239-1221-3381, 11/2019, $212 */
	
	private String imeIPrezime;
	
	public VisaKartica(double suma, String brKartice, int godina, int mesec, String imeIPrezime) {
		super(suma, brKartice, godina, mesec);
		this.imeIPrezime = imeIPrezime;
	}
	
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	
	public void izvrsiTransakciju(double trosak) { // metoda koja na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
		
		double provizija = trosak * 0.018;
		if(provizija<4) {
			super.izvrsiTransakciju(trosak + 4);
		}else {
			super.izvrsiTransakciju(trosak + provizija);
		}
	}
	
	public void stampaj() {
		System.out.print("Visa kartica: ");
		super.stampaj();
	}
	

}
