package resenje;

import java.util.Scanner;

public class domaci2 {

    public static void main(String[] args) {
        // 1) Napisati program gde korisnik unese datum rodjenja i program vrati koji je
        // to horoskopski znak

        int dan;
        int mesec;
        String znak = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite mesec rodjenja: ");
        mesec = s.nextInt();
        while (mesec < 1 || mesec > 12) {
            System.out.println("Unesite validan mesec (1-12): ");
            mesec = s.nextInt();
        }
        System.out.println("Unesite dan rodjenja: ");
        dan = s.nextInt();
        while (mesec == 2 && (dan < 1 || dan > 29)) {
            System.out.println("Unesite validan dan (1-29):");
            dan = s.nextInt();

        }
        while ((mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) && (dan < 1 || dan > 31)) {
            System.out.println("Unesite validan dan (1-31): ");
            dan = s.nextInt();
        }
        while ((mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) && (dan < 1 || dan > 30)) {
            System.out.println("Unesite validan dan (1-30)");
            dan = s.nextInt();

        }

        if (mesec == 12) {

            if (dan < 22)
                znak = "Strelac";
            else
                znak = "Jarac";
        }

        else if (mesec == 1) {
            if (dan < 20)
                znak = "Jarac";
            else
                znak = "Vodolija";
        }

        else if (mesec == 2) {
            if (dan < 19)
                znak = "Vodolija";
            else
                znak = "Ribe";
        }

        else if (mesec == 3) {
            if (dan < 21)
                znak = "Ribe";
            else
                znak = "Ovan";
        } else if (mesec == 4) {
            if (dan < 20)
                znak = "Ovan";
            else
                znak = "Bik";
        }

        else if (mesec == 5) {
            if (dan < 21)
                znak = "Bik";
            else
                znak = "Blizanci";
        }

        else if (mesec == 6) {
            if (dan < 21)
                znak = "Blizanci";
            else
                znak = "Rak";
        }

        else if (mesec == 7) {
            if (dan < 23)
                znak = "Rak";
            else
                znak = "Lav";
        }

        else if (mesec == 8) {
            if (dan < 23)
                znak = "Lav";
            else
                znak = "Devica";
        }

        else if (mesec == 9) {
            if (dan < 23)
                znak = "Devica";
            else
                znak = "Vaga";
        }

        else if (mesec == 10) {
            if (dan < 23)
                znak = "Vaga";
            else
                znak = "Skorpion";
        }

        else if (mesec == 11) {
            if (dan < 22)
                znak = "Skorpion";
            else
                znak = "Strelac";
        }

        System.out.println("Vas horoskopski znak je: " + znak);
    }

}
