import java.util.Scanner;

public class aviasirket_kodu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. İstifadəçidən uçuş kodunu alırıq.
        System.out.print("Uçuş kodunu daxil edin: ");
        String kod = sc.next();

        // 2. Daxil edilən koda uyğun aviaşirkəti müəyyən edirik.
        switch (kod) {

            // 3. Kod AZ-dirsə Azerbaijan Airlines çap olunur.
            case "AZ":
                System.out.println("Azerbaijan Airlines");
                break;

            // 4. Kod TK-dirsə Turkish Airlines çap olunur.
            case "TK":
                System.out.println("Turkish Airlines");
                break;

            // 5. Kod QR-dirsə Qatar Airways çap olunur.
            case "QR":
                System.out.println("Qatar Airways");
                break;

            // 6. Digər bütün kodlar üçün xəbərdarlıq çap olunur.
            default:
                System.out.println("Naməlum aviaşirkət");
        }
    }
}
