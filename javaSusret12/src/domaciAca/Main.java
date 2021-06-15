package domaciAca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Napisati glavni program, gde cete testirati kako ove klase funkcionisu.*/
		
		Sportista s1 = new Sportista("Janko Jankovic", 1995);
		Sportista s2 = new Sportista("Ivan Jokic", 1994);
		Sportista s3 = new Sportista("Marko Simic", 1993);
		Sportista s4 = new Sportista("Nikola Yec", 1992);
		
		Klub k1 = new Klub("Janko Jankovic", 1995, "FK Barselona", "Barselona", 1975);
		
		
		k1.dodavanjeSportiste(s1);
		k1.dodavanjeSportiste(s2);
		k1.dodavanjeSportiste(s3);
		k1.dodavanjeSportiste(s4);
		
		k1.stampanje2();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Posle uklanjanja sportiste");
		
		k1.uklanjanjeSportiste("Janko Jankovic");
		
		k1.stampanje2();
		
/*		s1.stampanje();
		s2.stampanje();  // Za dodatni zadatak ovo sam morao da zakometarišem
		s3.stampanje();
		s4.stampanje();*/
	}

}
