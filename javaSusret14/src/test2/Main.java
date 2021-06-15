package test2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		Kreirati glavnu klasu I u njoj: 
		 * 
					•	instancirati jednu planinu
					
					•	napraviti niz koji ce sadrzati tri rekrativna planinara I tri alpiniste
					
					•	ispisati podatke o svim planinarima I za svakog od planinara ispisati
					 da li ce se popeti na instanciranu planinu
					 
					•	ispisati kolika je zbir svih clanarina planinara iz niza */
		
		Planina planina1 = new Planina("Himalaji", "Nepal", 8500);
		
		RekreativniPlaninar rp1 = new RekreativniPlaninar(11, "Janko Jankovic", 12, "Sabac", 3500);
		RekreativniPlaninar rp2 = new RekreativniPlaninar(12, "Ivana Ivanic", 7, "Beograd", 2000);
		
		Alpinista a1 = new Alpinista(31, "Igor Kojic", 8);
		Alpinista a2 = new Alpinista(33, "Marko Markovic", 20);
		
	
		ArrayList<Planinar> listaPlaninara = new ArrayList<Planinar>();
		
		listaPlaninara.add(rp1);
		listaPlaninara.add(rp2);
		listaPlaninara.add(a1);
		listaPlaninara.add(a2);
		
		for (int i = 0; i < listaPlaninara.size(); i++) {
			listaPlaninara.get(i).stampaj();
			System.out.println("-----------------------");
		}
		
		double ukupnaClanarina = 0;
		int brojac = 1;
		for (int i = 0; i < listaPlaninara.size(); i++) {
			ukupnaClanarina+=listaPlaninara.get(i).clanarina();
			brojac++;
			
		}
		
		System.out.println("Ukupna clanarina je " + ukupnaClanarina + ". din");
		
		
	}

}
