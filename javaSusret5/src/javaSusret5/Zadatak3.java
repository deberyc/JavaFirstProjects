package javaSusret5;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	prvi dan u mesecu je ponedeljak, a mesec ima 31 dan
	korisnik unosi dan u nedelji, a program treba da kaze
	na koje dane u mesecu pada taj dan
	primer ispisa:
	utorak pada na
	 2
	 9
	16
	23
	30
	dan u mesecu */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan u nedelji: ");
		
		String danUNedelji = sc.next();
		
		switch (danUNedelji) {
		case "Ponedeljak": {
			System.out.print("Ponedeljak pada na: ");
			for (int i = 1; i <= 31; i = i + 7) {
				if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Utorak": {
			System.out.println("Utorak pada na: ");
			for (int i = 2; i <= 31; i = i + 7) {
				System.out.println(i);
			}
			System.out.println(" dan u mesecu");
			break;
		}
		case "Sreda": {
			System.out.println("Sreda pada na: ");
			for (int i = 3; i <= 31; i = i + 7) {
				System.out.println(i);
			}
			System.out.println(" dan u mesecu");
			break;
		}
		case "Cetvrtak": {
			System.out.println("Cetvrtak pada na: ");
			for (int i = 4; i <= 31; i = i + 7) {
				System.out.println(i);
			}
			System.out.println(" dan u mesecu");
			break;
		}
		case "Petak": {
			System.out.println("Petak pada na: ");
			for (int i = 5; i <= 31; i = i + 7) {
				System.out.println(i);
			}
			System.out.println(" dan u mesecu");
			break;
		}
		case "Subota": {
			System.out.println("Subota pada na: ");
			for (int i = 6; i <= 31; i = i + 7) {
				System.out.println(i);
			}
			System.out.println(" dan u mesecu");
			break;
		}
		case "Nedelja": {
			System.out.println("Nedelja pada na: ");
			for (int i = 7; i <= 31; i = i + 7) {
				System.out.println(i);
			}
			System.out.println(" dan u mesecu");
			break;
		}
		default:
			System.out.println("Uneli ste pogresan dan u nedelji ");
     			
     			
        
	}
		sc.close();	
	}
}
