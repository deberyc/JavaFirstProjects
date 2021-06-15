package apstraktneKlase;

public class Kvadrat extends GeometrijskaFigura{

	
/*	dodati klasu kvadrat i instancirati je iz glavne klase */
	
	
	
	private double stranica;

	public Kvadrat(double stranica) {
		super();
		this.stranica = stranica;
}

	public double getStranica() {
		return stranica;
}

	public void setStranica(double stranica) {
		this.stranica = stranica;
}
	
	@Override
	public double povrsina() {
		return stranica*stranica;
}
	@Override
	public double obim() {
		return 4*stranica;
}

	
}
