// Bank menyusu ekrana çıxarılır.
// İstifadəçinin seçiminə uyğun mesaj çap edilir.

import java.util.Scanner;

public class IfElseTask10 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // Bank menyusu göstərilir
        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");

        // İstifadəçidən seçim alınır
        System.out.print("Seçiminizi daxil edin: ");
        int secim = sc.nextInt();

        // Seçimə uyğun mesaj çap edilir
        switch (secim) {
            case 1:
                System.out.println("Balansınız: 1250 AZN");
                break;

            case 2:
                System.out.println("Pul yatırma əməliyyatı seçildi");
                break;

            case 3:
                System.out.println("Pul çıxarma əməliyyatı seçildi");
                break;

            case 4:
                System.out.println("Çıxış edildi");
                break;

            default:
                System.out.println("Yanlış seçim");
        }
    }
}
