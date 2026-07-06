// İstifadəçidən ay nömrəsi alınır.
// Switch və fall-through istifadə edərək fəslin adı ekrana çap edilir.

import java.util.Scanner;

    public class IfElseTask9 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən ay nömrəsi alınır
        System.out.print("Ay nomresini daxil edin: ");
        int ay = sc.nextInt();

        // Ay nömrəsinə uyğun fəsil müəyyən edilir
        switch (ay) {

            // Qış ayları
            case 12:
            case 1:
            case 2:
                System.out.println("Qis");
                break;

            // Yaz ayları
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;

            // Yay ayları
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;

            // Payız ayları
            case 9:
            case 10:
            case 11:
                System.out.println("Payiz");
                break;

            // Yanlış ay nömrəsi daxil edilərsə
            default:
                System.out.println("Yanlis ay nomresi");
        }
    }
}
