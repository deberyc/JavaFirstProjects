package zadatak1;

import java.util.ArrayList;

public class RadnikGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Radnik milovan = new Radnik(1231231231231l, "Milovan Pocek", 3, 5, 23);
		System.out.println("Radnik " + milovan.getImeIPrezime() + " ima platu " + milovan.platu()  + 
				" i ima dana godisnjeg: " + milovan.daniGodisnjeg() + " da li cemo mu dati kredit " + milovan.kreditnoSposoban());
		
		
	/*	System.out.println(milovan.getJmbg());
		int milovanovGodisnji = milovan.daniGodisnjeg();
		
		Radnik Sloba = new Radnik(1234123412341l);
		Sloba.setImeIPrezime("Sloba Milosevic");
		
		Radnik dragana;
		dragana = new Radnik(1231231231l, "Dragana Dragic", 4, 5, 12);
		System.out.println(dragana.getImeIPrezime());
		dragana.setStepenStrucneSpreme(9);*/
		
		
		Firma maxFirma = new Firma("max", "kocka", 2021); // instanciranje firmi
		Firma promet = new Firma("trgovina");
		promet.setNaziv("Megapromet");
		promet.setGodOsnivanja(1920);
		
		ArrayList<Firma> listaFirmi = new ArrayList<Firma>();
		listaFirmi.add(maxFirma);
		listaFirmi.add(promet);
		for (int i = 0; i < listaFirmi.size(); i++) {
			listaFirmi.get(i).stampajOFirmi();
		}
		
		System.out.println(milovan.getJmbg());
	//	int milovanovGodisnji = milovan.daniGodisnjeg();
		Radnik Sloba = new Radnik(1234123412341l);
		
		Sloba.setImeIPrezime("Sloba Milosevic");
		Radnik dragana;
		dragana = new Radnik(1231231231l, "Dragana Dragic", 4, 5, 12);
		System.out.println(dragana.getImeIPrezime());
		//dragana.setStepenStrucneSpreme(9);
		
		maxFirma.zaposljavanjeRadnika(milovan);  // dodavanje radnika firmi 1
		maxFirma.zaposljavanjeRadnika(dragana);
		
		maxFirma.ispisPodatakaOZaposlenima(); 
		promet.ispisPodatakaOZaposlenima();
		
		promet.zaposljavanjeRadnika(Sloba);  // dodavanje radnika firmi 2
		promet.ispisPodatakaOZaposlenima();

	}

	
}