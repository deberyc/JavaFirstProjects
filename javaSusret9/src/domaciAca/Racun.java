package domaciAca;

public class Racun {

	
	/*Napisati klasu Racun koja ima 2 atributa.
	Prvo atribut 'brRacuna' tipa String predstavlja broj racuna.
	brRacuna moze da se get, ali ne i set

	Drugi atribut 'stanje' tipa double i predstavlja stanje na racunu
	Stanje ima pocetnu vrednost 0 i moze da se dohvati/postavi

	Napraviti metode za dodavanje i oduzimanje novca za drugi atribut*/

	
	
	
	private String brojRacuna;
	private double stanje;

	public Racun() {
		this.stanje = 0;
	}

	public String getBroj() {
		return this.brojRacuna;
	}

	public double getStanje() {
		return this.stanje;
	}

	public void dodavanjeNovca(double iznos) {

		this.stanje += iznos;

	}

	public void uzimanjeNovca(double iznos) {

		this.stanje -= iznos;
	}
	
	
	
	
	

}