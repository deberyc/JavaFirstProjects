package domaciAca;

public class Putnik extends Covek {
	
	
/*	Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja
	mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili
	oduzme.  */

	
	
	private double novac;
	
		
	public Putnik(String imeIPrezime, double novac) {
	super(imeIPrezime);
	this.novac = novac;
}
	
	
	

	public double getNovac() {
		return novac;
	}



	public void dodavanjeNovca(double iznos) {  

		this.novac += iznos;

	}

	public void uzimanjeNovca(double iznos) {  

		this.novac -= iznos;
	}

	
	
	
}
