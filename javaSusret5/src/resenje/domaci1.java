package resenje;

import java.util.Scanner;

public class domaci1 {

    public static void main(String[] args) {

        double [] nizBrojeva = {3, 0, 1, -1, 2, 0};
        double aritmetickaSredina = 0;
        double zbir =0;
        System.out.println("Niz: ");
        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.println(nizBrojeva[i] + " ");
        }

        for (int i = 0; i < nizBrojeva.length; i++) {
            zbir += nizBrojeva[i];
        }
        System.out.println("Aritmeticka sredina niza: " + zbir / nizBrojeva.length);

    }
}
