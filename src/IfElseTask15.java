// İstifadəçidən parol alınır.
// Parolun uzunluğuna görə gücü müəyyən edilir.

import java.util.Scanner;

    public class IfElseTask15 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən parol alınır
        System.out.print("Parolu daxil edin: ");
        String password = sc.nextLine();

        // Parolun uzunluğu tapılır
        int length = password.length();

        // Parolun gücü yoxlanılır
        if (length == 0) {
            System.out.println("Parol bos ola bilmez");

        } else if (length > 0 && length < 6) {
            System.out.println("Zeif");

        } else if (length >= 6 && length <= 9) {
            System.out.println("Orta");

        } else if (length >= 10 || length > 20) {
            System.out.println("Guclu");
        }
    }
}