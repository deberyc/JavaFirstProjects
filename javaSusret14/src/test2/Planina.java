package test2;

public class Planina {

/*	Kreirati klasu Planina koja od privatnih atributa ima: 
 * 
		●	ime planine 
		●	naziv države u kojoj se nalazi 
		●	visinu planine. 
		
		a od javnih metoda: 
		●	default-ni konstruktor (konstruktor bez argumenata) i konstuktor koji postavlja sve parametre 
		●	gettere i settere za sve atribute   */

	
	private String imePlanine;
	private String drzavaPlanine;
	private double visinaPlanine;
	
	public Planina(String imePlanine, String drzavaPlanine, double visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.drzavaPlanine = drzavaPlanine;
		this.visinaPlanine = visinaPlanine;
	}

	
	public Planina() {
		super();
	}


	public String getImePlanine() {
		return imePlanine;
	}


	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}


	public String getDrzavaPlanine() {
		return drzavaPlanine;
	}


	public void setDrzavaPlanine(String drzavaPlanine) {
		this.drzavaPlanine = drzavaPlanine;
	}


	public double getVisinaPlanine() {
		return visinaPlanine;
	}


	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}
	
	
	
	
	
	
}
