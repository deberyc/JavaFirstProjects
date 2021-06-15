package testProba;

public class Koktel extends Pice{

	/*	Napraviti klasu Koktel koja nasledjuje Pice koja ima
	  
	Konstrukrore, gettere i settere
	
	Metodu koja racuna cenuPica po formuli 1.9 * cena svih sastojaka
	
	Metodu stampaj koja stampa ukupnu cenu koktela i sve sastojke sa cenama sastojaka
	
	
	Primer ispisa:
	Koktel: mojito, cena:114.0 din
	Sastojci:
	limun, cena: 30.0 din
	menta, cena: 20.0 din
	votka, cena: 10.0 din  */
	
	
	public Koktel(String naziv) {
		super(naziv);
		
		
		
	}
	@Override
	public double cenaPica() {
		double ukupnaCenaPica = 1.9 * super.cenaSvihSastojaka();
		return ukupnaCenaPica;
	}
	
	
	@Override
	public void stampaj() {
		System.out.println("Koktel " + super.getNaziv() + ", cena: " + this.cenaPica() + ". din");
		System.out.println("Sastojci: ");
		for (int i = 0; i < super.getListaSastojaka().size(); i++) {
			super.getListaSastojaka().get(i).stampaj();
		}
	}
	
	
}
