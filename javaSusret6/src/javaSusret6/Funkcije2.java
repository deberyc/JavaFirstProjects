package javaSusret6;

public class Funkcije2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 // Sabiranje dva broja, int		
		
		
		int a = 5;
		int b = 8;
		
		System.out.println("Ispis iz mejna, suma je " + sabiranjeDvaBroja(a,b)); 
		
		int suma = sabiranjeDvaBroja(a, b);
		System.out.println("Ispis iz mejna, suma je " + suma);  // moze i zbir da se zove
		
		
// 	Punoletan ili ne, String
		
		String rezultatFunkcije = daLiJePunoletan(30);
		System.out.println("Petar je: " + rezultatFunkcije);
		
		
 // boolean
		
		boolean punoletstvo = daLiJePunoletanBool(20);
		if(punoletstvo) {
			System.out.println("Milovan je punoletan");
		}else {
			System.out.println("Milovan je maloletan");
		} 
	
		

// Napisati funkciju koja prima broj i vraca text da li je broj pozitivan negativan ili nula. 
// Resenje ispisati iz main metode		
		
			
		String rezultatFunkcije = kakavJeBroj(0);
		System.out.println("Broj je: " + rezultatFunkcije);
	}

	
	//FUNKCIJE KOJE SMO NAPRAVILI
	
 // Sabiranje dva broja	
	
	public static int sabiranjeDvaBroja(int prviBroj, int drugiBroj) {
		int zbir = prviBroj + drugiBroj;
		return zbir;       
	}
	

// 	Punoletan ili ne, String
	
	
	public static String daLiJePunoletan(int brGodina) {
		String punoletstvo;
		if (brGodina>=18 ) {
			punoletstvo = "Punoletan";
		} else {
			punoletstvo = "Maloletan";
		}
		return punoletstvo;
	}

	
//Napisati funkciju koja prima broj i vraca text da li je broj pozitivan negativan ili nula. 
//Resenje ispisati iz main metode
	
	
	public static String kakavJeBroj(int broj) {  // u malu zagradu šta prima, a pre toga šta vraća definišemo
		String tipBroja;
		if (broj==0 ) {
			tipBroja = "nula";
		} else if (broj<0){
			tipBroja = "negativan";
		}
		else {
			tipBroja = "pozitivan";
		}
		return tipBroja;
	}
	
	
 // boolean
	
	public static boolean daLiJePunoletanBool(int brGodina) {
		boolean punoletstvo;
		if (brGodina>=18) {
			punoletstvo = true;
		}else {
			punoletstvo = false;
		}
		return punoletstvo;
	}
	
}
