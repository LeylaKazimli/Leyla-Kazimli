// İstifadəçidən yaş, aylıq gəlir və kredit məbləği alınır.
// Şərtlər yoxlanılır və kredit qərarı ekrana çap edilir.

import java.util.Scanner;

    public class IfElseTask7 {
    public static void main(String[] args) {

        // Scanner obyekti yaradılır
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən məlumatlar alınır
        System.out.print("Yasinizi daxil edin: ");
        int age = sc.nextInt();

        System.out.print("Ayliq gelirinizi daxil edin: ");
        double income = sc.nextDouble();

        System.out.print("Kredit meblegini daxil edin: ");
        double amount = sc.nextDouble();

        // Bütün şərtlər ödənirsə kredit təsdiqlənir
        if (age >= 21 && age <= 65 &&
                income > 800 &&
                amount >= 300 && amount <= 50000) {

            System.out.println("TESDIQ EDILDI");

            // Yaş şərti yoxlanılır
        } else if (age < 21 || age > 65) {

            System.out.println("Redd edildi: yas uygun deyil");

            // Gəlir şərti yoxlanılır
        } else if (income <= 800) {

            System.out.println("Redd edildi: gelir uygun deyil");

            // Kredit məbləği şərti yoxlanılır
        } else if (amount < 300 || amount > 50000) {

            System.out.println("Redd edildi: kredit meblegi uygun deyil");

        }

    }
}