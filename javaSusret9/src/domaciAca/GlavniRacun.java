package domaciAca;

public class GlavniRacun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racun racun01 = new Racun();
		System.out.println("Pocetno stanje: " + racun01.getStanje());

		racun01.dodavanjeNovca(3000.0);

		System.out.println(racun01.getStanje());

		racun01.uzimanjeNovca(1589.99);

		System.out.println(racun01.getStanje());
		
		
		
	}

}
