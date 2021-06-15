package resenje;

import java.util.Scanner;

public class domaci2
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        int num1 = sc.nextInt();

        System.out.print("Unesi drugi broj: ");
        int num2 = sc.nextInt();

        System.out.print("Unesi treci broj: ");
        int num3 = sc.nextInt();

        sc.close();

        if(sum(num1, num2, num3))
        {
            System.out.println("Zbir prva dva broja je treci broj");
        }
        else
        {
            System.out.println("Zbir prva dva broja nije treci broj");
        }
        sc.close();
    }

    public static boolean sum(int num1, int num2, int num3)
    {
        boolean vrednost = true;

        if(num1 + num2 != num3)
        {
            vrednost = false;
        }
        return vrednost;
    }
}
