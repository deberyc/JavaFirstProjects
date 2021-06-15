package zadatak3;

public class PlatnaKartica {

/*	Napraviti klasu PlatnaKartica koja ima
 * 
	• atribut suma - cuva trenutnu sumu novca na kartici u dolarima
	• atribut broj kartice primer: 4012-1239-1221-3381
	• atribut godina - godina do kada vazi kartica
	• atribut mesec- mesec do kada vazi kartica
	• konstruktor sa parametrima
	• gettere za sve atribute, bez settera
	
	• metodu dodajSredstva koja povecava sumu za unetu vrednost
	
	• metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
	
	• metodu koja stampa podatke o kartici u formatu:
	4012-1239-1221-3381, 11/2019, $212 */
	
	
	private double suma;
	private String brKartice;
	private int godina;
	private int mesec;
	
	public PlatnaKartica(double suma, String brKartice, int godina, int mesec) {
		super();
		this.suma = suma;
		this.brKartice = brKartice;
		this.godina = godina;
		this.mesec = mesec;
	}
	
	public double getSuma() {
		return suma;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public int getGodina() {
		return godina;
	}
	public int getMesec() {
		return mesec;
	}
	
	
	public void dodajSredstva(double uplata) { // metoda koja povecava sumu za unetu vrednost
		suma+=uplata;
	}
	public void izvrsiTransakciju(double trosak) { // metoda koja skida prosledjenu vrednost sa racuna.
		suma-=trosak;
	}
	
	
	public void stampaj() {
		System.out.println(this.brKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
	}
	
}
