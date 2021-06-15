package zadatak3;

public class MasterKartica extends PlatnaKartica{

	
/*	Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
 * 
	• konstruktor sa parametrima
	
	• implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu
	dodaje proviziju od 1.5 posto na sumu.
	
	• metoda naplatiOdrzavanje, koja sa racuna skida $2.
	
	• implementira metodu koja stampa podatke o kartici u formatu:
	Master Card: 12/2019, 4012-1239-1221-3381, $232 */
	
	public MasterKartica(double suma, String brKartice, int godina, int mesec) {
		super(suma, brKartice, godina, mesec);
	}
	
	
	public void izvrsiTransakciju(double trosak) { // na prosledjenu sumu dodaje proviziju od 1.5% posto na sumu.
		double provizija = trosak * 0.015;
		super.izvrsiTransakciju(trosak + provizija);
	}
	
	public void odrzavanje() {                 // metoda koja sa racuna skida $2.
		super.izvrsiTransakciju(2);
	}
	public void stampaj() {
		System.out.print("Master kartica: ");
		super.stampaj();
	}
	
}
