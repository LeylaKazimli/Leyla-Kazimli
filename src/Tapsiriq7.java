import java.util.Scanner;

public class Tapsiriq7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ondaliqli ededi daxil edin: ");
        double qiymet = sc.nextDouble();

        int castingNeticesi = (int) qiymet;

        long roundNeticesi = Math.round(qiymet);

        System.out.println("(int) casting neticesi: " + castingNeticesi);
        System.out.println("Math.round() neticesi: " + roundNeticesi);

        // (int) casting ondalıq hissəni kəsir.
        // Math.round() isə ən yaxın tam ədədə yuvarlaqlaşdırır.
    }
}