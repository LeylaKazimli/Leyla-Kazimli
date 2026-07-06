// İstifadəçidən imtahan balını alır və bala uyğun qiyməti çap edir.

import java.util.Scanner;

    public class IfElseTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İmtahan balını daxil edin: ");
        int bal = sc.nextInt();

        if (bal > 100 || bal < 0) {
            System.out.println("Yanlış bal!");
        } else if (bal >= 90) {
            System.out.println("Əla (5)");
        } else if (bal >= 80) {
            System.out.println("Çox yaxşı (4)");
        } else if (bal >= 70) {
            System.out.println("Yaxşı (3)");
        } else if (bal >= 60) {
            System.out.println("Kafi (2)");
        } else {
            System.out.println("Qeyri-kafi (1)");
        }
    }
}