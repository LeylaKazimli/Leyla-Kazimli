import java.util.Scanner;

    public class Tapsiriq2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kredit meblegini daxil edin: ");
        double mebleg = sc.nextDouble();

        System.out.print("Illik faiz derecesini daxil edin: ");
        double faiz = sc.nextDouble();

        System.out.print("Muddeti (ay) daxil edin: ");
        int muddet = sc.nextInt();

        double umumiFaiz = mebleg * (faiz / 100);

        double umumiOdenis = mebleg + umumiFaiz;

        double ayliqOdenis = umumiOdenis / muddet;

        System.out.println("Umumi faiz: " + umumiFaiz);
        System.out.println("Umumi odenis: " + umumiOdenis);
        System.out.println("Ayliq odenis: " + ayliqOdenis);
    }
}