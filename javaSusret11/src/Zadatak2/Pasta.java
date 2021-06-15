package Zadatak2;

import java.util.ArrayList;

public class Pasta {
	
/*	Kreirati klasu Pasta koja ima:
		●	listu  sastojaka
		
		●	defaultni konstruktor
		
		●	metodu za dodavanje sastojka
		●	metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
		●	metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
		●	metodu za stampu koja stampa podatke u formatu:
		
		Pasta je sa sastojcima:
		naziv - cena.din
		naziv - cena.din
		naziv - cena.din
		Cena paste je cena.din  */
	
	
	private ArrayList<Sastojak> listaSastojaka;
	
	
	
	public Pasta() {  // prazan konstruktor
		listaSastojaka = new ArrayList<Sastojak>(); // ako ne odradimo ovo nećemo imati ni praznu listu
	}
	
	
	
	public void dodavanjeSastojaka(Sastojak primljeniSastojak) { // mora kao argument da primi klasu
		this.listaSastojaka.add(primljeniSastojak);
	}
	
		
	public void brisanjeSastojaka(String nazivSastojka) { // brisanje sastojaka, ne celu klasu, samo jedan atribut prosleđujemo
		for (int i = 0; i < this.listaSastojaka.size(); i++) {
			if(this.listaSastojaka.get(i).getNaziv().equals(nazivSastojka)) { // equals može i objekte da poredi, tipa Sastojak nazivSastojka da smo prosledili, pošto je lista isto objekat
				listaSastojaka.remove(i);
			}
		}
	}
	
	public double izracunajCenuPaste() {  // suma cena svih sastojaka
		double cenaSvihSastojaka = 0;
		for (int i = 0; i < listaSastojaka.size(); i++) {
			cenaSvihSastojaka+=listaSastojaka.get(i).getCena();
		}
		return cenaSvihSastojaka;
	}
	
	
	public void stampanjePodatakaOPasti() {
		System.out.println("Pasta je sa sastojcima");
		for (int i = 0; i < listaSastojaka.size(); i++) {
			listaSastojaka.get(i).stampanjePodatakaOSastojku();
		}
		System.out.println("Cena paste je " + izracunajCenuPaste() + ".din");
	}
	
	
	

}
