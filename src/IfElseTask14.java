// İstifadəçidən ay nömrəsi alınır.
// Switch və fall-through istifadə edərək maliyyə rübü müəyyən edilir.

import java.util.Scanner;

    public class IfElseTask14 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən ay nömrəsi alınır
        System.out.print("Ay nomresini daxil edin: ");
        int ay = sc.nextInt();

        // Ay nömrəsinə uyğun rüb müəyyən edilir
        switch (ay) {

            // I rüb
            case 1:
            case 2:
            case 3:
                System.out.println("I rub");
                break;

            // II rüb
            case 4:
            case 5:
            case 6:
                System.out.println("II rub");
                break;

            // III rüb
            case 7:
            case 8:
            case 9:
                System.out.println("III rub");
                break;

            // IV rüb
            case 10:
            case 11:
            case 12:
                System.out.println("IV rub");
                break;

            // Yanlış ay nömrəsi daxil edilərsə
            default:
                System.out.println("Yanlis ay nomresi");
        }
    }
}
