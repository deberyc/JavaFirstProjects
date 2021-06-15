package domaciAca;

public class Vozac extends Covek {

//	Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	
	
	private String zvanje;

	public Vozac(String imeIPrezime, String zvanje) {
	super(imeIPrezime);
	this.zvanje = zvanje;
}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	
	
	
}
