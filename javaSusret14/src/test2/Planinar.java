package test2;

public abstract class Planinar {
	
/*	Kreirati apstraktnu klasu Planinar koja od zaštićenih atributa ima: 
 * 
		●	jedinstveni celobrojni identifikacioni broj
		●	ime i prezime 
		
		Dok od javnih metoda: 
		●	konstruktor koji postavlja sve atribute klase. 
		●	gettere 
		
		●	apstraktnu metodu štampaj
		●	apstraktnu metodu koja vraca clanarinu planinara
		●	apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu. 
		Metoda kao ulazni parametar prima objekat tipa Planina.  */

	
	private int idPlaninara;
	private String imeIPrezime;
	
	public Planinar(int idPlaninara, String imeIPrezime) {
		super();
		this.idPlaninara = idPlaninara;
		this.imeIPrezime = imeIPrezime;
	}

	
	public int getIdPlaninara() {
		return idPlaninara;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	
	public abstract void stampaj();
	public abstract double clanarina();
	public abstract boolean uspesanUspon(Planina pl);
	
	
}
