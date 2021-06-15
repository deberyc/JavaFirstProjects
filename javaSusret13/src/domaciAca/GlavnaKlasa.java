package domaciAca;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Autobus a1 = new Autobus("Jovan Jovanovic", "sofer", "Scania", 230);
		
		Vozac v1 = new Vozac("Ivan Ivanovic", "sofer");
		Vozac v2 = new Vozac("Marko Markovic", "sofer");
		
		Putnik p1 = new Putnik("Ana simic", 1000);
		Putnik p2 = new Putnik("Sanja Petrovic", 500);
		Putnik p3 = new Putnik("Igor Vranic", 350);
		Putnik p4 = new Putnik("Viktor Eric", 785);
		
		a1.dodavanjeVozaca(v1);
		a1.dodavanjeVozaca(v2);
		
		a1.dodavanjePutnika(p1);
		a1.dodavanjePutnika(p2);
		a1.dodavanjePutnika(p3);
		a1.dodavanjePutnika(p4);
		
		
		
		
		
	}

}
