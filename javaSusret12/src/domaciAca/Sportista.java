package domaciAca;

public class Sportista {

/*	Sportista poseduje ime, prezime i godinu rodjenja. Ime, prezime i godina rodjenja se
	zadaju prilikom kreiranja i ne mogu da se promene. Sportistu ispisati u obliku:

	IME_PREZIME: godinaRodjenja*/
	
	

	

	

	
	private String imeIPrezime;
	private int godinaRođenja;
	
	
	public Sportista(String imeIPrezime, int godinaRođenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.godinaRođenja = godinaRođenja;
	}


	public String getImeIPrezime() {
		return imeIPrezime;
	}


	public int getGodinaRođenja() {
		return godinaRođenja;
	}
	
	
	public void stampanje() {
		
		System.out.println("IME_PREZIME: " + this.imeIPrezime + " " + this.godinaRođenja);
	}
	
	
	
	
}
