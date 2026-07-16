import java.util.Scanner;

public class tapsiriq8_musbetededyoxlamasi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int eded;

        do {
            System.out.print("Ədəd daxil edin: ");
            eded = sc.nextInt();

            if (eded <= 0) {
                System.out.println("Yenidən daxil edin:");
            }

        } while (eded <= 0);

        System.out.println("Qəbul edildi: " + eded);

        sc.close(); // Scanner-i bağlayırıq.
    }
}
