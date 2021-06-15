 package Zadatak1;

public class Reakcija {

	/*	Zadatak
	Kreirati klasu Reakcija koja ima 
�?	tip reakcije (smajli, like, srce)
�?	ime i prezime korisnika koji je reagovao 
�?	gettere, settere i konstruktore*/



	private String tipReakcije;
	private String imeIPrezime;
	public Reakcija(String tipReakcije, String imeIPrezime) {
		
		this.tipReakcije = tipReakcije;
		this.imeIPrezime = imeIPrezime;
	}
	
	public String getTipReakcije() {
		return tipReakcije;
	}
	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	
	
	
	
	
	
	
}
