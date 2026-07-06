// İstifadəçidən yaş alınır.
// Yaşa uyğun bilet qiyməti ekrana çap edilir.

import java.util.Scanner;

    public class IfElseTask12 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən yaş alınır
        System.out.print("Yasinizi daxil edin: ");
        int age = sc.nextInt();

        // Yaşa uyğun bilet qiyməti müəyyən edilir
        if (age < 0) {
            System.out.println("Yanlis yas");

        } else if (age <= 5) {
            System.out.println("Pulsuz");

        } else if (age <= 17) {
            System.out.println("5 AZN");

        } else if (age <= 64) {
            System.out.println("10 AZN");

        } else {
            System.out.println("3 AZN");
        }
    }
}
