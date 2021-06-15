package automobil;

public class Automobil {
	
/*	napraviti klasu automobil koja od atributa ima marku, model, pogonsko gorivo, broj vrata, godinu proizvodnje. 
	Takodje ima 2 konstruktora: prvi prima sve atribute za argumente, a drugi je prazan


	takodje, ima funkciju koja stampa podatke o objektima

	iz AutomobilGlavna klase instancirajete nekoliko objekata klase automobil
	i odstampajte podatke o njima pozivajuci metodu za stampanje te klase
	
	Dodati private atribut potrosnja na 100km, napraviti getter i setter i napraviti metodu koja 
	odredjuje potrosnju na 100km, ako auto ima 3 vrata potrosnja je 5 litara, a ako auto ima 5 vrata potrosnja je 6 litara, 
	
	iz glavne klase ispisite model automobila i koliko trosi za svaki objekat  */
	
	public String markaAuta;
	public String modelAuta;
	public String pogonskoGorivo;
	public int brojVrata;
	public int godinaProizvodnje;
	
	private double potrosnja;
	
	public Automobil(String marka, String model, String gorivo, int vrata, int godina) {
		
		this.markaAuta = marka;
		this.modelAuta = model;
		this.pogonskoGorivo = gorivo;
		this.brojVrata = vrata;
		this.godinaProizvodnje = godina;
		
	}
	
	public Automobil() {
		
	}
	
	public void stampanjeVozilo() {
		System.out.println("Auto marke " + markaAuta + " model " + modelAuta + " koji ide na " + pogonskoGorivo + " ima ukupno " + 
	                       brojVrata + " vrata i proizveden je " + godinaProizvodnje + ". godine.");
	}
	
	public double getPotrosnja() {	
		return  this.potrosnja;
	}
	public void setPotrosnja() { // ne mora da prima nista, samo cemo pozvati metodu
		racunanjePotrosnje(); // branimo nase atribute, definisali smo za koliko vrata je koliko litara i to je to, ne moze da unese ko sta zeli
		
	}
	
	private void racunanjePotrosnje () { 
		if (this.brojVrata == 3) {
			this.potrosnja = 5;
		} else  if (this.brojVrata == 5) {
			this.potrosnja = 6;
		}
	}

}
