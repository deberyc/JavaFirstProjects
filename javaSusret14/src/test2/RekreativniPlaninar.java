package test2;

public class RekreativniPlaninar extends Planinar {
	/*	Kreirati klasu RekreativniPlaninar koja nasleđuje klasu Planinar. 
	 * 
	    Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru (znaci, nemaju setere): 
	    
			●	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
			●	naziv okruga odakle je rekreativni planinar. 
			●	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
			●	napraviti konstruktor
			
			●	da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, 
			s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
			●	rekeativci placaju clanarinu u iznosu od 1000 rsd
			●	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
			Rekreativac, id: id
			 ime: ime prezime 
			 Okrug: okrug   */

	
	private int tezinaOpreme;
	private String nazivOkruga;
	private double maxUsponBezOpreme;
	
	public RekreativniPlaninar(int idPlaninara, String imeIPrezime, int tezinaOpreme, String nazivOkruga,
			double maxUsponBezOpreme) {
		super(idPlaninara, imeIPrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}

	
	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public double getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}
	
	
	
	@Override
	public boolean uspesanUspon(Planina pl) {
		
		if(this.maxUsponBezOpreme - (this.tezinaOpreme * 50)>pl.getVisinaPlanine()) {
			
			return true;
		} else {
			
			return false;
		}
		
	}
	
	
	@Override
	public double clanarina() {
		
		return 1000;
	}
	
	
	@Override
	public void stampaj() {
		
		System.out.println("Rekreativac, id: " + super.getIdPlaninara());
		System.out.println("Ime: " + super.getImeIPrezime());
		System.out.println("Okrug: " + this.nazivOkruga);
	}
	

}
