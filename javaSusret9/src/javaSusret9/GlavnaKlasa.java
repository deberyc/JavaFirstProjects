package javaSusret9;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolaznikKursa polaznik1 = new PolaznikKursa();// ne prosleđujemo objektu ništa, prazan konstruktor
		
		PolaznikKursa polaznik2 = new PolaznikKursa(2, "Aca", "Milenković", 1992, 10); // novi objekat, odmah smo dodelili sve vrednosti
		
		PolaznikKursa polaznik3 = new PolaznikKursa(3, "Masinska skola");
				
		polaznik1.idPolaznika = 1; // ovde smo svakom od atributa dolelili vrednosti
		polaznik1.ime = "Miovan";
		polaznik1.prezime = "Pocek"; // atributi se obicno ne dodeljuju ovako, vec se prave konstruktori
		polaznik1.godinaRodjenja = 1988;
		polaznik1.prosek = 6.01; 
		
		polaznik1.setSrednjaSkola("Gimnazija Laza Kostic"); //private atribut, setovan naziv škole
		polaznik2.setSrednjaSkola("ES Nikola Tesla");
		
		int[] milovanoveOcene = {6, 7, 8, 7, 8, 8, 9, 9, 10};
		polaznik1.racunanjeProseka(milovanoveOcene);
		
		
		polaznik1.stampanjePodatakaOPolazniku();
		polaznik2.stampanjePodatakaOPolazniku();
		polaznik3.stampanjePodatakaOPolazniku();
				
		String imePolaznika1 = polaznik1.ime; // ne menja ime polaznika, staviće ga u ovu promenljivu 
		String srednjaSkolaPolaznika1 = polaznik1.getSrednjaSkola(); // želimo da uzmemo tu vrednost
		
		System.out.println("Polaznik 1 se zove " + imePolaznika1  //lokalna promenljiva, samo uzela vrednsot iz atributa
				+ " a isao je u srednju skolu " + srednjaSkolaPolaznika1);
		
		
		
		Racunar r1 = new Racunar("Asus", "rog", "i7", 16);			
		polaznik1.polaznikovRacunar = r1; // objekat postaje atribut u drugoj klasi
		polaznik1.stampanjeRacunara();
		
	}

}
