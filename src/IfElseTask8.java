// İstifadəçidən üç tərəf alınır.
// Üçbucağın mümkün olub-olmadığı və növü müəyyən edilir.

import java.util.Scanner;

public class IfElseTask8 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən tərəflər alınır
        System.out.print("Birinci terefi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci terefi daxil edin: ");
        int b = sc.nextInt();

        System.out.print("Ucuncu terefi daxil edin: ");
        int c = sc.nextInt();

        // Üçbucağın mümkün olub-olmadığı yoxlanılır
        if (a + b > c &&
                a + c > b &&
                b + c > a) {

            // Bütün tərəflər bərabərdirsə
            if (a == b && b == c) {
                System.out.println("Beraberterefli");

                // Yalnız iki tərəf bərabərdirsə
            } else if (a == b || a == c || b == c) {
                System.out.println("Beraberyanli");

                // Heç bir tərəf bərabər deyilsə
            } else {
                System.out.println("Muxtelifterefli");
            }

            // Üçbucaq mümkün deyilsə
        } else {
            System.out.println("Bele ucbucaq movcud deyil");
        }
    }
}