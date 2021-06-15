package zadatak1;

public class Radnik {

	/*Kreirati klasu Radnik koja ima:
		● jmbg radnika (razmisliti kog tipa ce biti promenljiva)
		● ime i prezime
		● broj dece (1,2,3,... ili 0 ako nema dece)
		● stepen strucne spreme (od 1 do 8)
		● godine radnog staza
		
		● gettere i settere za sve atribute (jmbg-a ne sme da se menja, ali mora da postoji) To znači da ne treba da mu se napravi setter(jer se kasnije može izmeniti), 
		samo prilikom inicijalizacije kroz konstruktor može da mu se dodeli vrednost (da se tako zapamti), tako se štiti od kasnijih promena.
		
		● konstruktore koje smatrate da su logicni da postoje
		
		● metodu koja vraca koeficijent slozenosti
		● metodu koja racuna i vraca minuli rad
		● metodu koja racuna platu radnika, plata se racuna po formuli:
		25000 + (koeficijent slozenosti + minuli rad) * 10000
		● metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban
		ako je plata veca od 50 000)
		● metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu
		godinu.Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2
		dana
		
		U main metodi kreirati objekat radnik i pozvati sve metode (5 metoda).*/

	// kroz gettere i settere kontrolišemo svoje objekte, definišemo ponašanje svojih atributa
	// u setteru dodajemo neku logiku, gde definišemo koju vrednost ta promenljiva može da dobije
	
	
	private long jmbg; // private promenljiva postavljamo vrednost na dva načina, kroz konstruktor i kroz setter
	private String imeIPrezime;
	private int brojDece; // ako niko ne sme da sazna broj dece, onda izostavimo getter
	private int stepenStrucneSpreme;
	private int radniStaz;
	
	
	public Radnik(long jmbg, String imeIPrezime, int brojDece, int stepenStrucneSpreme, int radniStaz) { //ovaj konstruktor jer je prakticnije da se tako formira objekat
		super();
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrezime;
		this.brojDece = brojDece;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.radniStaz = radniStaz;
	}
	
	public Radnik(long jmbg) { // ovaj konstruktor jer mora da postoji
		this.jmbg = jmbg;
	}
	public long getJmbg() { // samo get nemamo set, jer ne sme da se menja
		return jmbg;
	}
	
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getBrojDece() {
		return brojDece;
	}
	public void setBrojDece(int brojDece) {
		this.brojDece = brojDece;
	}
	public int getStepenStrucneSpreme() {
		return stepenStrucneSpreme;
	}
	public void setStepenStrucneSpreme(int stepenSS){
		this.stepenStrucneSpreme = stepenSS;
	}
	public int getRadniStaz() {
		return radniStaz;
	}
	public void setRadniStaz(int radniStaz) {
		this.radniStaz = radniStaz;
	}
	
	
	public double koeficijent() {
		double koeficijent = 0;
		switch (this.stepenStrucneSpreme) {
		case 1:
			koeficijent = 1.03;
			break;
		case 2:
			koeficijent = 1.65;
			break;
		case 3:
			koeficijent = 2.00;
			break;
		case 4:
			koeficijent = 2.27;
			break;
		case 5:
			koeficijent = 2.88;
			break;
		case 6:
			koeficijent = 3.09;
			break;
		case 7:
			koeficijent = 3.40;
			break;
		case 8:
			koeficijent = 4.12;
			break;
		}
		return koeficijent;
	}
	
	
	public double minuliRad() {
		if(this.radniStaz < 10) {
			return 0.05;
		} else if (this.radniStaz < 20) {
			return 0.75;
		} else {
			return 1.0;
		}
	}
	
	
	public double platu() {
		double k = this.koeficijent();
		double mr = this.minuliRad();
		return 25000 + (k + mr) * 10000;
	}
	
	
	public boolean kreditnoSposoban() {
		if (this.platu() > 50000) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public int daniGodisnjeg() {
		return 22 + (this.brojDece * 2);
	}
	
	public void ispisPodatakaORadniku() {
		System.out.println("Ime radnika " + this.imeIPrezime + " ima " + this.radniStaz + " godine radnog staza");
	}
	
}
