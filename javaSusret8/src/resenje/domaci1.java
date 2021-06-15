package resenje;

import java.util.Scanner;

public class domaci1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite redni broj dana u godini: ");

        int dan = sc.nextInt();
        int danUNedelji = 1;

        for (int i = dan; i >= -6; i-=7) {
            if (dan < 1 || dan > 365) {
                System.out.println("Greska u unosu, unesite broj od 1 do 365");
                break;
            }
            danUNedelji = i;
        }


        switch (danUNedelji) {
            case -6: {
                System.out.println("Dan " + dan + ". je ponedeljak.");
            }
            break;
            case -5: {
                System.out.println("Dan " + dan + ". je utorak.");
            }
            break;
            case -4: {
                System.out.println("Dan " + dan + ". je sreda.");
            }
            break;
            case -3: {
                System.out.println("Dan " + dan + ". je cetvrtak.");
            }
            break;
            case -2: {
                System.out.println("Dan " + dan + ". je petak.");
            }
            break;
            case -1: {
                System.out.println("Dan " + dan + ". je subota.");
            }
            break;
            case 0: {
                System.out.println("Dan " + dan + ". je nedelja.");
            }
            break;
            default:
                break;
        }
        sc.close();
    }

}
