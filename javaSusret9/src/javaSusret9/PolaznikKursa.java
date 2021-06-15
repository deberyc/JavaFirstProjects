package javaSusret9;

public class PolaznikKursa {

	public int idPolaznika; //sta je u bazama record u tabeli, ovde je objekat
	public String ime;  // atributi (propertiji) klase.
	public String prezime; // mi smo objekti, a klasa je sablon, kalup za taj objekat
	public int godinaRodjenja;
	public double prosek; 
	
	private String srednjaSkola; // pristupamo mu samo u okviru njegove klase
	
	public Racunar polaznikovRacunar; //atribut tipa neke druge klase
	
	
	
	public PolaznikKursa(int id, String ime, String prezime, int godinaRodjenja, double prosecnaOcena) { //konstruktor sa svim atributima, velikim slovom, isto kao i klasa
		
		this.idPolaznika = id;   // ne moraju isto da se zovu u konstruktoru
		this.ime = ime; // sa this. pristupamo svim atributima i metodama ove klase
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
		this.prosek = prosecnaOcena; // ne moraju isto da se zovu u konstruktoru
	}
	
	public PolaznikKursa(int id, String srednjaSkola) { //konstruktor sa samo dva atributa
		
		this.idPolaznika = id;  
		this.srednjaSkola = srednjaSkola;
	}
	
	
	public PolaznikKursa() {//prazan (default) konstruktor
		
	} 			
	
	
	
	
		
			
	public void stampanjePodatakaOPolazniku() {
		System.out.println("Polaznik sa id-jem " + this.idPolaznika + " se zove " + this.ime + " " + 
	                       this.prezime + " i rodjen je " + this.godinaRodjenja + " i ima prosek " + this.prosek + " a isao je u srednju skolu " + this.srednjaSkola);
			
	}
	
	
	public void racunanjeProseka(int[] ocene) { // još jedna fja kao stampanje,  za prosek
		double zbirOcena = 0;
		for (int i = 0; i < ocene.length; i++) {
			zbirOcena+=ocene[i];
			
		}
		this.prosek = zbirOcena/ocene.length;
	}
	
	public void setSrednjaSkola(String nazivSkole) { //setter, bez njega nemože da se postavi private atribut u main metodi
		this.srednjaSkola = nazivSkole;
	}
	
	public String getSrednjaSkola() {
		return  this.srednjaSkola;
	}
	
	
	
		
	
	
	public void stampanjeRacunara() {
		System.out.println("Polaznik " + this.ime + " " + this.prezime + " ima racunar: " + 
	                        this.polaznikovRacunar.markaRacunara + " model je " + this.polaznikovRacunar.modelRacunara);
		
	}
	
	
	
}
 