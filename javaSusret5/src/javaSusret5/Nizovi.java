package javaSusret5;

public class Nizovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nizBrojeva = new int[7];
		//double[]  nizDablova = new double[5];
		
		String[] nizBoja = new String[4];
		nizBoja[0] = "zuta";
		nizBoja[2] = "plava";
		nizBoja[1] = "braon";
		nizBoja[3] = "crvena";
		int duzinaNiza = nizBoja.length;
		System.out.println("Niz sadrzi " + duzinaNiza + " elementa");
		for (int i = 0; i < nizBoja.length; i++) {
			System.out.println((i+1) + ". element niza je " + nizBoja[i]);		
		}
		System.out.println("Kraj programa");
	
// dane u nedelji stavite u niz, a zatim ih sve ispisite		
		
		String[] nizDana = new String [7];
		nizDana [0] = "ponedeljak";
		nizDana [1] = "utorak";
		nizDana [2] = "sreda";
		nizDana [3] ="cetvrtak"; // difoltna pozicija za String je null
		nizDana [4] = "petak";
		nizDana [5] = "subota";
		nizDana [6] = "nedelja";
		int duzinaNiza = nizDana.length;
		System.out.println("Niz sadrzi " + duzinaNiza + " dana.");
		
	 	for (int i = 0; i < nizDana.length; i++)  {
			System.out.println((i+1) + ". dan u nedelji je " + nizDana[i] + ".");
		}
		
		
// ALTERNATIVNO INICIJALIZOVANJE NIZA
		
	 	
	 	String[] nizDana = {"ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja"};
	 	 	
	 	for (int i = 0; i < nizDana.length; i++) {
	 			System.out.println((i+1) + ". element niza je " + nizDana[i] + ".");
	 		}

	 			System.out.println("\nKraj programa.");
		
		
		String[] nizCveca = {"Ruza", "Ljubicica", "Lala", "Fikus", "Lavanda"};
		
		System.out.println("Element sa indexom 3 je " + nizCveca[3]);
		
		System.out.println("Duzina niza je " + nizCveca.length);
		
		nizCveca[2] = "maslacak";
		for (int i = 0; i < nizCveca.length; i++) {
			System.out.println((i+1) + ". element niza je " + nizCveca[i]);
		}
		
		int[] nizBrojeva = new int[3]; //difoltna pozicija za int je 0, kad ne definisemo element niza
		System.out.println(nizBrojeva[1]);
		
						
		
}
	
}
