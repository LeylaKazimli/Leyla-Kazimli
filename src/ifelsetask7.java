import java.util.Scanner;

    public class ifelsetask7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yasinizi daxil edin: ");
        int age = sc.nextInt();

        System.out.print("Ayliq gelirinizi daxil edin: ");
        double income = sc.nextDouble();

        System.out.print("Kredit meblegini daxil edin: ");
        double amount = sc.nextDouble();

        if (age >= 21 && age <= 65 &&
                income > 800 &&
                amount >= 300 && amount <= 50000) {

            System.out.println("TESDIQ EDILDI");

        } else if (age < 21 || age > 65) {

            System.out.println("Redd edildi: yas uygun deyil");

        } else if (income <= 800) {

            System.out.println("Redd edildi: gelir uygun deyil");

        } else if (amount < 300 || amount > 50000) {

            System.out.println("Redd edildi: kredit meblegi uygun deyil");

        }

    }
}