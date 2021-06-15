package javaSusret6;

public class FunkcijeKalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati kalkulator. Korisnik unosi dva broja i operaciju koju zeli da odradi s njima, 
a mi ispisujemo rezultat. 
Operacije su +,-,*,/,%*/
		
		int a = 10;
		int b = 7;
		
		
		
		
		/*System.out.println("Zbir brojeva " + a + " i " + b + " je " + sabiranje(a, b));
		System.out.println("Razlika brojeva " + a + " i " + b + " je " + oduzimanje(a, b));
		System.out.println("Proizvod brojeva " + a + " i " + b + " je " + množenje(a, b));
		System.out.println("Kolicnik brojeva " + a + " i " + b + " je " + deljenje(a, b));
		System.out.println("Ostatak deljenja brojeva " + a + " i " + b + " je " + ostatak(a, b));*/
		 
		System.out.println("Zbir brojeva " + a + " i " + b + " je " + kalkulator(a, b, "+"));
		System.out.println("Razlika brojeva " + a + " i " + b + " je " + kalkulator(a, b, "-"));
		System.out.println("Proizvod brojeva " + a + " i " + b + " je " + kalkulator(a, b, "*"));
		System.out.println("Kolicnik brojeva " + a + " i " + b + " je " + kalkulator(a, b, "/"));
		System.out.println("Ostatak deljenja brojeva " + a + " i " + b + " je " + kalkulator(a, b, "%"));
	}

	
	/*public static int sabiranje(int prviBroj, int drugiBroj) {
		int zbir = prviBroj + drugiBroj;
		return zbir;
	}
	public static int oduzimanje(int prviBroj, int drugiBroj) {
		int razlika = prviBroj - drugiBroj;
		return razlika;
	}
	public static int množenje(int prviBroj, int drugiBroj) {
		int proizvod = prviBroj * drugiBroj;
		return proizvod;
	}
	public static int deljenje(int prviBroj, int drugiBroj) {
		int količnik = prviBroj / drugiBroj;
		return količnik;
	}
	public static int ostatak(int prviBroj, int drugiBroj) {
		int ostatakDeljenja = prviBroj - drugiBroj;
		return ostatakDeljenja;
	}*/
	
	public static int kalkulator(int prviBroj, int drugiBroj, String operator) {
		int rezultat;
		if(operator.equals("+")) {
			rezultat = prviBroj + drugiBroj;
		}else if (operator.equals("-")){
			rezultat = prviBroj - drugiBroj;
		}else if (operator.equals("*")){
			rezultat = prviBroj * drugiBroj;
		}
		 else if(operator.equals("/")){
			rezultat = prviBroj / drugiBroj;
		}
					
		 else {
			rezultat = prviBroj % drugiBroj;
		}
			 
		      return rezultat;    	
        }
	     
	
}	

