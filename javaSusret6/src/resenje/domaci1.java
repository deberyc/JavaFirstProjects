package resenje;

import java.util.Scanner;

public class domaci1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = sc.nextLine();

        System.out.println("Unesite prezime: ");
        String prezime = sc.nextLine();

        System.out.println("Unesite pol m ili z: ");
        String pol = sc.next();

        if (pol.equalsIgnoreCase("m")) {

            System.out.println(ime + " " + prezime + ", dobrodosao u IT!");

        }

        else if (pol.equalsIgnoreCase("z")) {

            System.out.println(ime + " " + prezime + ", dobrodosla u IT!");

        }

        sc.close();
    }


}
