import java.util.Scanner;

public class Tapsiriq5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tam ededi daxil edin: ");
        int tamEded = sc.nextInt();

        double doubleEded = tamEded;

        System.out.println("Widening neticesi: " + doubleEded);

        System.out.print("Ondaliqli ededi daxil edin: ");
        double ondalqliEded = sc.nextDouble();

        int intEded = (int) ondalqliEded;

        System.out.println("Narrowing neticesi: " + intEded);

        // (int) casting ondalıq hissəni yuvarlaqlaşdırmır.
        // Sadəcə ondalıq hissəni kəsir.
        // Məsələn: 9.87 → 9
    }
}