package javaSusret7;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    
/* Napisati funkciju koja od dva ulazna Stringa
formira rezultujuci string.
Parametri funkcije su
firstStr, secondStr i swap(boolean)

		Ako se unesu vrednosti:
		firstStr = "xxx"
		secondStr = "zzz"
		swap = false
		Vraca string:
		"xxxzzz"
	
		Ako se unesu vrednosti:
		firstStr = "xxx"
		secondStr = "zzz"
		swap = true
		Vraca string:
		"zzzxxx" */
		
		
		
		boolean zamena=true;
		
		String ispis = zamenaMesta("prvi", "drugi", zamena);
	
			if (zamena)	{
				System.out.println("Zamenili smo stringove "  +  ispis);}
			
			else {
				System.out.println("Nismo zamenili stringove "  +  ispis);}
			
						
	}
	
	
	public static String zamenaMesta (String firstStr, String secondStr, boolean swap) {   
		String ispis=" ";
		if (swap==false){
			ispis= firstStr + " "+  secondStr; 
			}
		
		else {
			ispis= secondStr + "  "+  firstStr;
			}
		return ispis;
	
				
	}
	
	
}	

