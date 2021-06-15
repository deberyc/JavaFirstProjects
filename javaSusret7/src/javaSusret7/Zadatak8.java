package javaSusret7;

public class Zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* definisati niz 5 imena
definisati niz 5 prezimena
definisati niz 5 fakulteta
definisati niz 5 proseka
definisati niz 5 godina

napraviti funkciju koja stampa
Ime i Prezime je zavrsio/la fakultet ime fakulteta
sa prosecnom pocenom prosecna ocena a rodjen je godina
funkciju pozvati 5 puta (iteracijama) */
		
		String[] imena = {"Ana", "Marko", "Ivana", "Nikola", "Sara"};
		String[] prezimena = {"Simic", "Markovic", "Ivanovic", "Nikolic", "Jankovic"};
		String[] fakulteti = {"PMF", "DIF", "FTN", "Ekonomski fakultet", "Medicinski fakultet"};
		Double[] proseci = {9.56, 8.78, 9.06, 9.55, 9.88};
		int[] godinaRodjenja = {1992, 1993, 1994, 1990, 1989};
		
		for(int i=0;i<5;i++)
		{
			stampaj(imena[i],prezimena[i],fakulteti[i],proseci[i],godinaRodjenja[i]);
		}
		
		
	}
	
	
	public static void stampaj(String ime,String prezime,String fakultet,double prosek,int godina){
		System.out.println(ime+" "+prezime+" je zavrsio/la fakultet "+fakultet+" sa prosecnom ocenom "+prosek+
				", a rodjen/na je "+ godina+ ". godine.");
		}
	
	
	
}
