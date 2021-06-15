package Zadatak2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	U glavnom programu kreirati objekte i testirati funkcionalnosti */
		
		Sastojak sastojak1 = new Sastojak("Makaroni", 50);
		Sastojak sastojak2 = new Sastojak("Sunkarica", 60);
		Sastojak sastojak3 = new Sastojak("Kackavalj", 35);
		Sastojak sastojak4 = new Sastojak("Majonez", 10);
		
		Pasta aLaMilovan = new Pasta();
		
		
		aLaMilovan.dodavanjeSastojaka(sastojak1); // dodavanje u listu
		aLaMilovan.dodavanjeSastojaka(sastojak2);
		aLaMilovan.dodavanjeSastojaka(sastojak3);
		aLaMilovan.dodavanjeSastojaka(sastojak4);
		
		aLaMilovan.stampanjePodatakaOPasti();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Nakon brisanja majoneza");
		
		aLaMilovan.brisanjeSastojaka("Majonez");
		//aLaMilovan.brisanjeSastojaka(sastojak4.getNaziv()); // isto način za brisanje
		
		
		aLaMilovan.stampanjePodatakaOPasti();

		
		
		
	}

}
