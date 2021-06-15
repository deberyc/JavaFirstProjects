package javaSusret9;

public class Racunar {
	
	// dodajte klasu racunar (atributi: marka model ram procesor)
	
	// polazniku kursa dodajte atribut polaznikov racunar
	
	// i dodajte metodu koja stampa podatke o polaznikovom imenu i racunaru koji koristi
	
	// na kraju instancirajte par racunara i dodajte ih polaznicima i odstampajte poruke
	
	

	public String markaRacunara;
	public String modelRacunara;
	public String procesorRacunara;
	public int ramMemorija;
	
	public Racunar (String marka, String model, String procesor, int ram) {
		this.markaRacunara = marka;
		this.modelRacunara = model;
		this.procesorRacunara = procesor;
		this.ramMemorija = ram;
		
	}
	
	public Racunar() {
		
	}
	
}
