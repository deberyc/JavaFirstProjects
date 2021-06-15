package package1;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//Napisati program koji stampapodatke o glumcu i glumici i da li su iz Srbije.	
		
		
		String imeGlumca = "Dwayne"; // Glumio je u "Jumanji: Welcome to the Jungle", avantura.
		String prezimeGlumca = "Johnson"; 
		String imeGlumice = "Julia"; // Glumila je u "Ocean's Twelve", odličan film i uloga.
		String prezimeGlumice = "Roberts";
		char polGlumac = 'm';
		char polGlumica = 'z';
		int godGlumac = 48;
		int godGlumica = 53;
		double ocenaGlumac = 9.56;
		double ocenaGlumica = 9.72;
		boolean srbGlumac = false;
		boolean srbGlumica = false;
		
		System.out.println("Ime: " + imeGlumca + "\n" + "Prezime: " + prezimeGlumca + "\n" + "Pol: " + 
		                   polGlumac + "\n" + "Godine: " + godGlumac + "\n" + "Ocena: " + ocenaGlumac + 
		                   "\n" + "Iz Srbije: " + srbGlumac);

		System.out.println("\n\nIme: " + imeGlumice + "\n" + "Prezime: " + prezimeGlumice + "\n" + "Pol: " + 
                polGlumica + "\n" + "Godine: " + godGlumica + "\n" + "Ocena: " + ocenaGlumica + 
                "\n" + "Iz Srbije: " + srbGlumica);
		
		
		
//Izracunati trecu stranicu trougla  

		double str1 = 5;
		double str2 = 10;
		

		System.out.println("Treca stranica trougla str3 je: " + Math.sqrt(Math.pow(str1, 2) + Math.pow(str2, 2)));
		
	}

}
