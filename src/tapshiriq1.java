import java.util.Scanner;

    public class tapshiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Balı daxil edin (1-100): ");
        int bal = sc.nextInt();

        if (bal >= 90 && bal <= 100) {
            System.out.println("Bal: " + bal + " → Qiymət: Əla");
        } else if (bal >= 70) {
            System.out.println("Bal: " + bal + " → Qiymət: Yaxşı");
        } else if (bal >= 50) {
            System.out.println("Bal: " + bal + " → Qiymət: Kafi");
        } else if (bal >= 1) {
            System.out.println("Bal: " + bal + " → Qiymət: Qeyri-kafi");
        } else {
            System.out.println("Yanlış bal daxil etdiniz!");
        }

        sc.close();
    }
}
