package domaciAca;

import java.util.ArrayList;

public class Autobus extends Vozac{

	/*	Autobus poseduje naziv, vozaca, cenu karte i putnike koji se njime voze. Naziv i cena
	karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca  */
	
	
	
	private String nazivAutobusa;
	private double cenaKarte;
	private ArrayList<Putnik> listaPutnika;
	private ArrayList<Vozac> listaVozaca;
	
	
	public Autobus(String imeIPrezime, String zvanje, String nazivAutobusa, double cenaKarte) {
		super(imeIPrezime, zvanje);
		this.nazivAutobusa = nazivAutobusa;
		this.cenaKarte = cenaKarte;
		
		this.listaPutnika = new ArrayList<Putnik>();
		this.listaVozaca = new ArrayList<Vozac>();
	}
	
	
	
	
	
	public void dodavanjePutnika(Putnik dodatiPutnika) {
		this.listaPutnika.add(dodatiPutnika);
		
	}
	
	public void dodavanjeVozaca(Vozac dodatiVozaca) {
		this.listaVozaca.add(dodatiVozaca);
		
	}
	
	
	public void uklanjanjePutnika(String imeIPrezimePutnika) { 
		for (int i = 0; i < this.listaPutnika.size(); i++) {
			if(this.listaPutnika.get(i).getImeIPrezime().equals(imeIPrezimePutnika)) { 
				listaPutnika.remove(i);
			}
		}
	}
	
	
	public void uklanjanjeVozaca(String imeIPrezimeVozaca) { 
		for (int i = 0; i < this.listaVozaca.size(); i++) {
			if(this.listaVozaca.get(i).getImeIPrezime().equals(imeIPrezimeVozaca)) { 
				listaVozaca.remove(i);
			}
		}
	}
	
	
	
	
}
