package Zadatak1;

import java.util.ArrayList;

public class FacebookPost {
	
	
/*	Kreirati klasu FacebookPost koja ima:
		�?	ime i prezime korisnika koji je stavio objavu
		�?	tekst objave
		�?	Listu reakcija
		
		�?	metodu reaguj, koja dodaje reakciju u listu
		
		�?	privatnu metodu koja vraca broj reakcija odredjenog tipa 
		                                   (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
		                                   
		�?	metodu stampaj koja stampa info o objavi u formatu:
																ime i prezime
																tekst objave
																Smajli 10 | Like 15 | Srce 2 */
	
	
	
	private String imeIPrezime;
	private String textObjave;
	private ArrayList<Reakcija> reakcije;
	
	public FacebookPost(String imeIPrezime, String textObjave) {
		
		this.imeIPrezime = imeIPrezime;
		this.textObjave = textObjave;
		this.reakcije = new ArrayList<Reakcija>();
	}
	
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getTextObjave() {
		return textObjave;
	}
	public void setTextObjave(String textObjave) {
		this.textObjave = textObjave;
	}
	
	
	public ArrayList<Reakcija> getReakcije() {
		return reakcije;
	}
	public void setReakcije(ArrayList<Reakcija> reakcije) {
		this.reakcije = reakcije;
	}
	
	
	public void reaguj(Reakcija r1) {  // metoda reaguj, koja dodaje reakciju u listu
		this.reakcije.add(r1);
	}
	
	
	private int prebrojavanjeTipovaReakcija(String tipReakcije) {
		int brojac = 0;
		for (int i = 0; i < reakcije.size(); i++) {
			if(reakcije.get(i).getTipReakcije().equals(tipReakcije)) { // metoda koja vraca broj reakcija odredjenog tipa 
				brojac++;
			}
		}
		return brojac;
	}
	
	
	public void stampanjePodatakaOPostu() {
		System.out.println(this.imeIPrezime);
		System.out.println(this.textObjave);
		System.out.println("Smajliji " + prebrojavanjeTipovaReakcija("Smajli") + " | Like " + prebrojavanjeTipovaReakcija("Like") + 
				" | Srce " + prebrojavanjeTipovaReakcija("Srce"));
	}

	
	
	
	
	

}
