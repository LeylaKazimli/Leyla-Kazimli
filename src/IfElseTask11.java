// İstifadəçidən bir hərf alınır.
// Hərfin sait və ya samit olduğu müəyyən edilir.

import java.util.Scanner;

    public class IfElseTask11 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən hərf alınır
        System.out.print("Bir herf daxil edin: ");
        char herf = sc.next().charAt(0);

        // Hərfin sait və ya samit olduğu yoxlanılır
        switch (herf) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Sait");
                break;

            default:
                System.out.println("Samit");
        }
    }
}
