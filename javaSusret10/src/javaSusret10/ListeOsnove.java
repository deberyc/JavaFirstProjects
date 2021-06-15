package javaSusret10;

import java.util.ArrayList; // mora da se uveze uvek

public class ListeOsnove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Liste osnove
// Doradite zadatak tako da drugi i cetvrti element liste zamene svoje pozicije
		
		String[] imena  = new String[4];
		imena[0] = "Petar";
		imena[1] = "Marija";
		imena[2] = "Dragana";
		imena[3] = "Jelisaveta";
		
		//imena[4] = "Paja";
		//System.out.println(imena[4]); greska jer smo definasili niz od 4 elementa
		
		
		ArrayList imena1 = new ArrayList(); // Array lista je lista objekata, ArrayList<String> imena2
		
		
		imena1.add("Milovan");
		//System.out.println(imena1.get(0));
		imena1.add("Dragan");
		imena1.add("Petar");
		imena1.add("Milutin");
		imena1.add(3);
		imena1.add(true);
		imena1.add("Marko");
		
		int duzinaListe = imena1.size(); 
		
		String[] imenaZaDodavanje = {"Pera", "Zika"}; // dodavanje odjednom dva imena
		for (int i = 0; i < 2; i++) {
			imena1.add(imenaZaDodavanje[i]);
		}
		
		
		System.out.println("Vrednost drugog elementa liste je " + imena1.get(1)); // ovo je indeks elementa koji pozivamo
		System.out.println("Duzina liste pre brisanja drugog elementa je: " + duzinaListe);
		
		imena1.remove(1); // Open declaration, kao pozivanje fje kod objekata
		System.out.println("Vrednost drugog elementa liste, posle brisanja je " + imena1.get(1));
		
		duzinaListe = imena1.size();
		System.out.println("Duzina liste posle brisanja drugog elementa je: " + duzinaListe);
		
		for (int i = 0; i < imena1.size(); i++) {
			System.out.println((i+1) + ". element liste je " + imena1.get(i));
		}
		
		
		Object elementPrePromene=imena1.get(1);
		imena1.set(1, imena1.get(3));
		System.out.println(imena1.get(1));
		
		imena1.set(3, elementPrePromene);
		
		System.out.println(imena1.get(3));
		
		
	}

}
