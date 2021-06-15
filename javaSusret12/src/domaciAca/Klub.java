package domaciAca;

import java.util.ArrayList;


/*Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. Sva polja mogu da se
dohvate, a naziv kluba moze i da se postavi.*/

/*Dodatak zadatku za vezbu: U Klubu napraviti niz sportista tipa Sportista umesto jednog sportiste.
Samim tim postojace metode koje ce dodavati i uklanjati sportistu.  */

public class Klub extends Sportista{

	
	private String nazivKLuba;
	private String sedistekluba;
	private int godinaOsnivanja;
	private ArrayList<Sportista> listaSportista;
	
	
	public Klub(String imeIPrezime, int godinaRođenja, String nazivKLuba, String sedistekluba, int godinaOsnivanja) {
		super(imeIPrezime, godinaRođenja);
		this.nazivKLuba = nazivKLuba;
		this.sedistekluba = sedistekluba;
		this.godinaOsnivanja = godinaOsnivanja;
		this.listaSportista = new ArrayList<Sportista>();
	}

	

	public String getNazivKLuba() {
		return nazivKLuba;
	}

	public void setNazivKLuba(String nazivKLuba) {
		this.nazivKLuba = nazivKLuba;
	}

	public String getSedistekluba() {
		return sedistekluba;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}
	
	public void dodavanjeSportiste(Sportista dodatiSportistu) {
		this.listaSportista.add(dodatiSportistu);
		
	}
	
	
	public void uklanjanjeSportiste(String imeIPrezimeSportiste) { 
		for (int i = 0; i < this.listaSportista.size(); i++) {
			if(this.listaSportista.get(i).getImeIPrezime().equals(imeIPrezimeSportiste)) { 
				listaSportista.remove(i);
			}
		}
	}
	
	
	public void stampanje2() {
		System.out.println("Na listi sportista su: ");
		for (int i = 0; i < listaSportista.size(); i++) {
			listaSportista.get(i).stampanje();
		}
	
	}
	
	

}