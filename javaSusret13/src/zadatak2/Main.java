package zadatak2;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	/*	U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
	 
		U glavnom programu kreirati listu akcija i izvrsiti ih nad istim plejerom. */
		
		
		
		VideoPlayer vidPly = new VideoPlayer(3500, 2000, 54, 144);
		vidPly.stampaj();
		System.out.println("-----------------------");
		
		TimeControl premotajUnapred = new TimeControl(true);
		premotajUnapred.izvrsiAkciju(vidPly);
		vidPly.stampaj();
		System.out.println("-----------------------");
		
		AudioControl stisaj = new AudioControl(false);
		stisaj.izvrsiAkciju(vidPly);
		stisaj.izvrsiAkciju(vidPly);
		stisaj.izvrsiAkciju(vidPly);
		vidPly.stampaj();
		System.out.println("-----------------------");
		
		QualityOptimizerControl qualityControl = new QualityOptimizerControl(30);
		qualityControl.izvrsiAkciju(vidPly);
		vidPly.stampaj();
		System.out.println("-----------------------");
		
		TimeControl premotajUnazad = new TimeControl(false);
		AudioControl pojacaj = new AudioControl(true);
		QualityOptimizerControl qualityControl1 = new QualityOptimizerControl(50);
		
		
		ArrayList<Control> listaAkcija = new ArrayList<Control>();
		
		listaAkcija.add(premotajUnazad);
		listaAkcija.add(pojacaj);
		listaAkcija.add(qualityControl1);
		for (int i = 0; i < listaAkcija.size(); i++) {
			listaAkcija.get(i).izvrsiAkciju(vidPly);
		}
		vidPly.stampaj();
		System.out.println("-----------------------");
		for (int i = 0; i < 20; i++) {
			pojacaj.izvrsiAkciju(vidPly);
		}
		vidPly.stampaj();
		
		
		

	}

}
