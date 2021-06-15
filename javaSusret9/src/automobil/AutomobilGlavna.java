package automobil;

public class AutomobilGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Automobil auto1 = new Automobil("Peugeut", "508", "benzin", 5, 2010 );
		Automobil auto2 = new Automobil("Hyndai", "Tucson", "benzin", 5, 2020 );
		Automobil auto3 = new Automobil("Mercedes", "A klasa", "diesel", 3, 2005 );
		Automobil auto4 = new Automobil();
		
		 auto4.markaAuta = "Fijat";
		 auto4.modelAuta = "Punto";
		 auto4.brojVrata = 5;
		 auto4.godinaProizvodnje = 1999;
		 auto4.pogonskoGorivo = "benzin";
		 
		auto1.stampanjeVozilo();
		auto2.stampanjeVozilo();
		auto3.stampanjeVozilo();
		auto4.stampanjeVozilo();
		
		auto1.setPotrosnja();
		auto2.setPotrosnja();
		auto3.setPotrosnja();
		
		System.out.println(auto1.modelAuta + " na 100 km trosi " + auto1.getPotrosnja() + " litara.");
		System.out.println(auto2.modelAuta + " na 100 km trosi " + auto2.getPotrosnja() + " litara.");
		System.out.println(auto3.modelAuta + " na 100 km trosi " + auto3.getPotrosnja() + " litara.");
	}

}
