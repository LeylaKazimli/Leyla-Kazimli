// İstifadəçidən il alır və uyğun (keçən) il olub-olmadığını yoxlayır.

import java.util.Scanner;

    public class IfElseTask4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("İli daxil edin: ");
        int il = sc.nextInt();

        System.out.println((il % 400 == 0 || il % 4 == 0 && il % 100 != 0) ? "Uyğun il" : "Uyğun deyil");
    }
}