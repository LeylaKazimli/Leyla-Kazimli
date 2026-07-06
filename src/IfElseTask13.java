// İstifadəçidən çəki və boy alınır.
// BMI hesablanır və nəticəyə uyğun kateqoriya ekrana çap edilir.

import java.util.Scanner;

public class IfElseTask13 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən çəki və boy alınır
        System.out.print("Cekinizi daxil edin (kq): ");
        double ceki = sc.nextDouble();

        System.out.print("Boyunuzu daxil edin (metr): ");
        double boy = sc.nextDouble();

        // BMI hesablanır
        double bmi = ceki / (boy * boy);

        // BMI kateqoriyası müəyyən edilir
        if (bmi < 18.5) {
            System.out.println("Ariq");

        } else if (bmi <= 24.9) {
            System.out.println("Normal");

        } else if (bmi <= 29.9) {
            System.out.println("Artiq cekili");

        } else {
            System.out.println("Piylenme");
        }
    }
}
