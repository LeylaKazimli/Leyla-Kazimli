import java.util.Scanner;

public class Tapsiriq3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("3 reqemli ededi daxil edin: ");
        int sayi = sc.nextInt();

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        int cem = yuzler + onlar + birler;

        System.out.println("Yuzler: " + yuzler);
        System.out.println("Onlar: " + onlar);
        System.out.println("Birler: " + birler);
        System.out.println("Reqemlerin cemi: " + cem);
    }
}