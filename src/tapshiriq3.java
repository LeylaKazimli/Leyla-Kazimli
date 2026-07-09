import java.util.Scanner;

    public class tapshiriq3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("İlkin balansı daxil edin: ");
        double balans = sc.nextDouble();

        while (true) {

            System.out.print("Əməliyyat məbləğini daxil edin (Dayandırmaq üçün 0 yazın): ");
            double emeliyyat = sc.nextDouble();

            if (emeliyyat == 0) {
                break;
            }

            balans = balans + emeliyyat;

            System.out.println("Cari balans: " + balans);

            if (balans < 0) {
                System.out.println("Xəbərdarlıq! Balans mənfidir.");
            }
        }

        System.out.println("Son balans: " + balans);

        sc.close();
    }
}
