package javaSusret3;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*Napisati program koji ispisuje svaki peti broj izmedju 10 i 50
takodje ispisuje koji put ste usli u petlju)
primer resenja je:
vrednost promenljive je 10 usao sam u petlju 1.put
vrednost promenljive je 15 usao sam u petlju 2.put
...sve tako do 50 (ukljucujuci i 50) */
		
      int i = 10;
		int n = 1;
		while (i <= 50) {
			System.out.println("Usao sam u petlju " + n + ". put, a vrednost i je " + i);
			i+= 5;
			n++;
		}
		System.out.println("Kraj programa");  
		
		
		//Sabrati svaki 5. broj od 10 do 50, ukljucujuci i 10 i 50
		
		
		int j = 10;
		int zbir = 0;
		while (j <= 50) {
			zbir = zbir + j;
			System.out.println("j je " + j + ", a trenutni zbir je " + zbir);
			j+=5;
		}
		System.out.println("\nKraj programa.");  
		
							
	}
	

}
