package package1;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		
		System.out.println("Unesite ime: ");
		String ime = s.next();
				
		System.out.println("Unesite prezime: ");
		String prezime = s.next();
		
		System.out.println("Unesite email: ");
		String email = s.next();
		
		System.out.println("Unesite fakultet: ");
		String fakultet = s.next();
		
		System.out.println("Unesite godinu rođenja: ");
		int godRodjenja = s.nextInt();
		
		System.out.println("Unesite prosečnu ocenu: ");
		double prosecnaOcena = s.nextDouble();
		
		System.out.println("Unesite omiljeno slovo: ");
		String omiljenoSlovo = s.next();
		
		System.out.println("Da li korisnik voli programiranje: ");
		boolean programiranjeYes = s.nextBoolean();
		
		
		/*System.out.println("Ime korisnika je: " + ime);
		System.out.println("Prezime korisnika je: " + prezime);
		System.out.println("Email korisnika je: " + email);
		System.out.println("Fakultet korisnika je: " + fakultet);
		System.out.println("Godina rođenja korisnika je: " + godRodjenja);
		System.out.println("Prosečna ocena korisnika je: " + prosecnaOcena);
		System.out.println("Omiljeno slovo korisnika je: " + omiljenoSlovo);
		System.out.println("Korisni voli programiranje: " + programiranjeYes);*/
	
		
		System.out.println("\nIme korisnika je: " + ime + ".\nPrezime korisnika je: " + prezime +
							".\nEmail korisnika je: " + email + ".\nFakultet korisnika je: " + fakultet + 
							".\nGodina rođenja korisnika je: " + godRodjenja + 
							".\nProsečna ocena korisnika je: " + prosecnaOcena + ".\nOmiljeno slovo korisnika je: " + 
							omiljenoSlovo + ".\nKorisni voli programiranje: " + programiranjeYes);
		
		s.close();
		
	}

}
