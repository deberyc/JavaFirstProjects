package testProba;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
/*		U glavnoj klasi napraviti listu pica koja ce sadrzati dve kafe i tri koktela (svako pice ima nekoliko
				sastojaka) i na kraju ispisati racun u formatu:
				
				Pica koja ste porucili:
				1. pice: Mocha, procenat kofeina: 1%, cena: 150.0 din
				Sastojci:
				Mleko, cena: 50.0 din
				Slag, cena: 70.0 din
				-----------------------------------
				2. pice: NesKafa, procenat kofeina: 3%, cena: 235.0 din
				Sastojci:
				Sladoled, cena: 25.0 din
				Slag, cena: 70.0 din
				Mleko, cena: 50.0 din
				-----------------------------------
				3. pice: Koktel: mojito, cena:114.0 din
				Sastojci:
				limun, cena: 30.0 din
				menta, cena: 20.0 din
				votka, cena: 10.0 din
				-----------------------------------
				4. pice: Koktel: White Rusian, cena:114.0 din
				Sastojci:
				votka, cena: 10.0 din
				Mleko, cena: 50.0 din
				-----------------------------------
				5. pice: Koktel: Bambus, cena:95.0 din
				Sastojci:
				crno vino, cena: 20.0 din
				koka kola, cena: 30.0 din
				-----------------------------------
				Ukupan iznos racuna je: 708.0    */

		
		
		// sastojci su nezavisni jedni od drugih iako se isto zovu
		
	//	Sastojak jabuka = new Sastojak("jabuka", 50, 1);
		
		//jabuka.stampaj();
		
		
		Kafa makijato = new Kafa("makijato", 7);
		Sastojak mleko = new Sastojak("mleko", 20, 2);
		Sastojak slatkaPavlaka = new Sastojak("slatka pavlaka", 10, 3);
		
		makijato.dodajSastojak(mleko);
		makijato.dodajSastojak(slatkaPavlaka);
		
		
		Kafa neskafa = new Kafa("nes kafa", 5);
		
		neskafa.dodajSastojak(mleko);
		neskafa.dodajSastojak(slatkaPavlaka);
		
		
		Koktel goldenSunrise = new Koktel("golden sunrise");
		Sastojak tekila = new Sastojak("tekila olmeca", 10, 25);
		Sastojak multivitamin = new Sastojak("multivitamin", 100, 1);
		Sastojak limun = new Sastojak("limun", 5, 3);
		
		goldenSunrise.dodajSastojak(limun);
		goldenSunrise.dodajSastojak(tekila);
		goldenSunrise.dodajSastojak(multivitamin);
		
		
		Koktel mojito = new Koktel("mojito");
		Sastojak votka = new Sastojak("votka", 10, 15);
		Sastojak menta = new Sastojak("menta", 3, 70);
		
		mojito.dodajSastojak(limun);
		mojito.dodajSastojak(votka);
		mojito.dodajSastojak(menta);
		
		Koktel whiteRussian = new Koktel("white Russian");
		whiteRussian.dodajSastojak(votka);
		whiteRussian.dodajSastojak(mleko);
		
		
		ArrayList<Pice> picaSaRacuna = new ArrayList<Pice>();
		
		picaSaRacuna.add(makijato);
		picaSaRacuna.add(neskafa);
		picaSaRacuna.add(whiteRussian);
		picaSaRacuna.add(mojito);
		picaSaRacuna.add(goldenSunrise);
		
		double ukupnaCenaRacuna = 0;
		int brojac = 1;
		for (int i = 0; i < picaSaRacuna.size(); i++) {
			ukupnaCenaRacuna+=picaSaRacuna.get(i).cenaPica();
			System.out.print(brojac + ". piće: ");
			brojac++;
			picaSaRacuna.get(i).stampaj();
			System.out.println("---------------------------------------------");
		}
		System.out.println("Ukupna cena racuna je " + ukupnaCenaRacuna + ". din");


	

}
}
