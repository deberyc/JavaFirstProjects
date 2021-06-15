package resenje;

import java.util.Scanner;

public class domaci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj od 1 do 10: ");

        int broj = sc.nextInt();

        if (broj >= 1 && broj <= 10) {
            if (broj % 2 == 0 && broj % 3 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else if (broj % 2 == 0 && broj % 4 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else if (broj % 2 == 0 && broj % 5 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else if (broj % 3 == 0 && broj % 9 == 0) {
                System.out.println("Broj " + broj + " nije prost.");
            } else {
                System.out.println("Broj je prost");
            }
        } else {
            System.out.println("Unesite broj od 1 do 10.");
        }

    }
}