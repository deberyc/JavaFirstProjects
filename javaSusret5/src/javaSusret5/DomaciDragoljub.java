package javaSusret5;

import java.util.Scanner;

public class DomaciDragoljub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati niz brojeva i prikazati aritmeticku sredinu niza (elementi i rezultat double)
NIKAKO nemoj deliti sa brojem. Recimo ako imate 4 clana niza nemojte racunati sredinu broj/4 
nego kolicnik treba da bude promenljiva. Da ako povecate ili smanjite clanove niza mozete 
lako da izracunate.*/
		
		double[] nizBrojeva = {5, 10, 17, 23};
		double zbir = 0;
		double aritmetickaSredina = 0;
		
			for (int i = 0; i < nizBrojeva.length; i++) {
			zbir+=nizBrojeva[i];
			aritmetickaSredina = zbir/nizBrojeva.length;	
			
		}
			System.out.println("Aritmeticka sredina elemenata niza je: " + aritmetickaSredina); 
		
/*Napisati program gde korisnik unese datum rodjenja i program vrati 
koji je to horoskopski znak (datum mozete preko promenljive, mozete preko skenera, 
mozete mesec string ili integer, 
kako god.)*/
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite dan rođenja: ");
		int dan = s.nextInt();
				
		System.out.println("Unesite mesec rođenja: ");
		int mesec = s.nextInt();
		
		String horoskopskiZnak;
 			
		if (mesec == 12){ 
            
            if (dan < 22) 
            horoskopskiZnak = "strelac"; 
            else
            horoskopskiZnak = "jarac"; 
        
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
		} 
	
		else if (mesec == 1){ 
            if (dan < 21) 
            	horoskopskiZnak = "jarac"; 
            else
            	horoskopskiZnak = "vodolija"; 
            
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
		
		else if (mesec == 2){ 
            if (dan < 20) 
            	horoskopskiZnak = "vodolija"; 
            else
            	horoskopskiZnak = "riba"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if(mesec == 3){ 
            if (dan < 21)  
            	horoskopskiZnak = "riba"; 
            else
            	horoskopskiZnak = "ovan"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
        else if (mesec == 4){ 
            if (dan < 21) 
            	horoskopskiZnak = "ovan"; 
            else
            	horoskopskiZnak = "bik"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if (mesec == 5){ 
            if (dan < 22) 
            	horoskopskiZnak = "bik"; 
            else
            	horoskopskiZnak = "blizanci"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if( mesec == 6){ 
            if (dan < 22) 
            	horoskopskiZnak = "blizanci"; 
            else
            	horoskopskiZnak = "rak"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if (mesec == 7){ 
            if (dan < 23) 
            	horoskopskiZnak = "rak"; 
            else
            	horoskopskiZnak = "lav"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if( mesec == 8){ 
            if (dan < 23)  
            	horoskopskiZnak = "lav"; 
            else
            	horoskopskiZnak = "devica"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if (mesec == 9){ 
            if (dan < 23) 
            	horoskopskiZnak = "devica"; 
            else
            	horoskopskiZnak = "vodolija"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if (mesec == 10){ 
            if (dan < 24) 
            	horoskopskiZnak = "vodolija"; 
            else
            	horoskopskiZnak = "škorpija"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
              
        else if (mesec == 11){ 
            if (dan < 23) 
            	horoskopskiZnak = "škorpija"; 
            else
            	horoskopskiZnak = "strelac"; 
            System.out.println("Vaš horoskopski znak je: " + horoskopskiZnak + "."); 
        } 
		
		s.close();		

	}
}
