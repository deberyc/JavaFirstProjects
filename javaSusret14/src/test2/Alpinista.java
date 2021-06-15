package test2;

public class Alpinista extends Planinar{
	/* Kreirati klasu Alpinista koja nasleđuje klasu Planinar. 
	 * 
	 * Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
	   i poeni se mogu menjati (znaci, postojace seter). 
	   Napraviti konstruktor. 
	   
	   Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 
	pritom za svaki poen ima popust od 50,

	a informacije o alpinisti se ispisuju u formatu: 
	Alpinista, id: id
	ime: ime i prezime 
	Broj poena: poeni  */

	private int poeni;

	public Alpinista(int idPlaninara, String imeIPrezime, int poeni) {
	super(idPlaninara, imeIPrezime);
	this.poeni = poeni;
}


	
	@Override
	public  boolean uspesanUspon(Planina pl) {
		
		if(pl.getVisinaPlanine()<=4000) {
			
			return true;
		} else {
			
			return false;
		}
				
					
	}
	
	
	@Override
	public double clanarina() {
		
		if(this.poeni<=30) {
			
			return 1500 - (this.poeni * 50);
			
		} else {
			
			return 1500;
		}
		
	}	
			
	
	@Override
	public void stampaj() {
		
		System.out.println("Alpinista, id: " + super.getIdPlaninara());
		System.out.println("Ime: " + super.getImeIPrezime());
		System.out.println("Broj poena: " + this.poeni);
		
	}
	
	
}
