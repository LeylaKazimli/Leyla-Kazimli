
import java.util.Scanner;

public class tapsiriq8_0aqedercemle {
    public static void main(String[] args) {

        // Tapşırıq:
        // Scanner ilə istifadəçidən ədədlər al.
        // İstifadəçi 0 daxil edənə qədər
        // ədədləri cəmlə.
        // 0 cəmə daxil edilmir.
        // Sonda cəmi ekrana çap et.

        Scanner sc = new Scanner(System.in);

        int eded;
        int cem = 0;

        do {
            System.out.print("Ədəd daxil edin: ");
            eded = sc.nextInt();

            if (eded != 0) {
                cem = cem + eded;
            }

        } while (eded != 0);

        System.out.println("Cəm: " + cem);

        sc.close();
    }
}