package zadatak1;

import java.util.ArrayList;

public class Firma {
	
	
/*	Dodajte klasu firma koja ima od atributa naziv, oblastPoslovanja i godinu kada je osnovana

 	Iz glavne klase instancirati nekoliko firmi
	
	
	Klasi firma dodati atribut radnici koji je tipa lista radnika, 
	
	Zatim napraviti funkciju dodavanja radnika u klasi firma koja dodaje radnike toj firmi, 
	
	takodje dodati funkciju koja ispisuje podatke o radnicima te firme (ako firma nema ni jednog radnika onda to i ispisati)

	Na kraju iz glavne klase dodajte par radnika firmi i ispisite podatke o zaposlenima u firmi  */
	
	private String naziv;
	private String oblastPoslovanja;
	private int godOsnivanja;
	private ArrayList<Radnik> radnici; //samo smo deklasirali radnici String listu
	
	
	public Firma(String naziv, String oblastPoslovanja, int godOsnivanja) {
		this.naziv = naziv;
		this.oblastPoslovanja = oblastPoslovanja;
		this.godOsnivanja = godOsnivanja;
		this.radnici = new ArrayList<Radnik>();// radnici nova lista radnika, treba i inicijalizovati ovu listu da bi mogli posle sa njom da radimo nešto
	}
	public Firma(String oblastPoslovanja) {
	
		this.oblastPoslovanja = oblastPoslovanja;
		this.radnici = new ArrayList<Radnik>();
	}
	
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}
	public String getOblastPoslovanja() {
		return oblastPoslovanja;
	}

	
	
	public void stampajOFirmi() {
		System.out.println("Nasa firma se zove " + this.naziv + " i bavimo se " + this.oblastPoslovanja + " a osnovani smo" + this.godOsnivanja);
	}
	
	public void zaposljavanjeRadnika(Radnik zaposlen) { // f-ja za dodavanje radnika firmi
		this.radnici.add(zaposlen);
	}
	
	
	public void ispisPodatakaOZaposlenima() {
		if(radnici.size() == 0) {
			System.out.println("Firma " + this.naziv + " nema ni jednog zaposlenog");
		}else {
			System.out.println("U " + this.naziv + " rade:");
			for (int i = 0; i < radnici.size(); i++) {
				radnici.get(i).ispisPodatakaORadniku();
			}
		}
	}
	
	
	
}
