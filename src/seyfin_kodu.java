import java.util.Scanner;

public class seyfin_kodu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Seyfin gizli kodunu təyin edirik.
        int kod = 275;

        // 2. Cəhdlərin sayını saxlamaq üçün dəyişən yaradırıq.
        int cehd = 0;

        // 3. İstifadəçinin daxil edəcəyi təxmin üçün dəyişən yaradırıq.
        int texmin;

        // 4. İlk təxmini istifadəçidən alırıq.
        System.out.print("Kodu daxil edin: ");
        texmin = sc.nextInt();
        cehd++;

        // 5. İstifadəçi düzgün kodu tapana qədər dövr davam edir.
        while (texmin != kod) {

            // 6. Təxmin böyükdürsə məlumat veririk.
            if (texmin > kod) {
                System.out.println("Böyükdür");
            } else {
                // 7. Əks halda təxmin kiçikdir.
                System.out.println("Kiçikdir");
            }

            // 8. Yeni təxmini istifadəçidən alırıq.
            System.out.print("Kodu daxil edin: ");
            texmin = sc.nextInt();
            cehd++;
        }

        // 9. Düzgün kod tapıldıqda məlumat veririk.
        System.out.println("Seyf açıldı!");

        // 10. Ümumi cəhd sayını çap edirik.
        System.out.println("Cəhd sayı: " + cehd);
    }
}
