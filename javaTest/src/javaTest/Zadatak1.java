package javaTest;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Napisite niz od 10 elemenata i koristeci petlju pronadjite najmanji broj u nizu
		//Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
		//Primer ispisa resenja u konzoli: 
		//Najmanji broj u nizu je -1

		
		int[] nizBrojeva = {10, 4, 86, -8, 77, 123, 22, 2, 33, -1};
		
		int najmanjiBroj = nizBrojeva[0];
				
		for(int i = 0; i<nizBrojeva.length; i++) 
			
			if (nizBrojeva [i] < najmanjiBroj) {
				najmanjiBroj = nizBrojeva[i];		
			}
										
		System.out.println("Najmanji broj u nizu je " + najmanjiBroj + ".");		
		
		}
					
				
	}


