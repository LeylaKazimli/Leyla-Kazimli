import java.util.Scanner;

public class vahid_cevirici_menyusu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. İstifadəçiyə menyunu göstəririk.
        System.out.println("1) Metr → Fut");
        System.out.println("2) Kiloqram → Funt");
        System.out.println("3) Selsi → Fahrenheit");
        System.out.println("0) Çıxış");
        System.out.print("Seçiminizi daxil edin: ");

        // 2. İstifadəçinin seçimini alırıq.
        int secim = sc.nextInt();

        // 3. İstifadəçi 0 seçməyənə qədər dövr davam edir.
        while (secim != 0) {

            // 4. Seçimə uyğun çevirmə əməliyyatını yerinə yetiririk.
            switch (secim) {

                // 5. Metri futa çeviririk.
                case 1:
                    System.out.print("Metri daxil edin: ");
                    double metr = sc.nextDouble();
                    System.out.println("Nəticə: " + (metr * 3.28084));
                    break;

                // 6. Kiloqramı funta çeviririk.
                case 2:
                    System.out.print("Kiloqramı daxil edin: ");
                    double kiloqram = sc.nextDouble();
                    System.out.println("Nəticə: " + (kiloqram * 2.20462));
                    break;

                // 7. Selsini Fahrenheitə çeviririk.
                case 3:
                    System.out.print("Selsini daxil edin: ");
                    double selsi = sc.nextDouble();
                    System.out.println("Nəticə: " + (selsi * 9 / 5 + 32));
                    break;

                // 8. Yanlış seçim daxil edilərsə xəbərdarlıq edirik.
                default:
                    System.out.println("Yanlış seçim!");
            }

            // 9. Menyunu yenidən göstəririk.
            System.out.println();
            System.out.println("1) Metr → Fut");
            System.out.println("2) Kiloqram → Funt");
            System.out.println("3) Selsi → Fahrenheit");
            System.out.println("0) Çıxış");
            System.out.print("Seçiminizi daxil edin: ");

            // 10. Yeni seçimi istifadəçidən alırıq.
            secim = sc.nextInt();
        }

        // 11. İstifadəçi 0 seçdikdə proqramı bitiririk.
        System.out.println("Çıxış edildi");

        // 12. Scanner-i bağlayırıq.
        sc.close();
    }
}