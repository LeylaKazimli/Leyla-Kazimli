import java.util.Scanner;

public class anbar_stoku {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Anbarın ilkin stoku 200-dür.
        int stok = 200;

        // 2. İstifadəçinin daxil edəcəyi əməliyyat üçün dəyişən.
        int emeliyyat;

        // 3. İlk əməliyyatı istifadəçidən alırıq.
        System.out.print("Əməliyyatı daxil edin (+ gəlib, - satılıb, 0 çıxış): ");
        emeliyyat = sc.nextInt();

        // 4. İstifadəçi 0 daxil etməyənə qədər dövr davam edir.
        while (emeliyyat != 0) {

            // 5. Müsbət ədəd gəlibsə stoka əlavə olunur,
            // mənfi ədəddirsə avtomatik stokdan çıxılır.
            stok = stok + emeliyyat;

            // 6. Yeni stoku ekrana çıxarırıq.
            System.out.println("Yeni stok: " + stok);

            // 7. Növbəti əməliyyatı yenidən istifadəçidən alırıq.
            System.out.print("Əməliyyatı daxil edin (+ gəlib, - satılıb, 0 çıxış): ");
            emeliyyat = sc.nextInt();
        }

        // 8. İstifadəçi 0 daxil etdikdə proqram bitir.
        System.out.println("Proqram dayandırıldı.");

        sc.close();
    }
}