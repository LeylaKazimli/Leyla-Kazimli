import java.util.Scanner;

    public class tapshiriq8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yaşı daxil edin: ");
        int yas = sc.nextInt();

        int qiymet;

        if (yas <= 7) {
            qiymet = 0;
        } else if (yas <= 17) {
            qiymet = 3;
        } else if (yas <= 64) {
            qiymet = 7;
        } else {
            qiymet = 4;
        }

        System.out.println("1 biletin qiyməti: " + qiymet + " AZN");

        System.out.print("Neçə bilet alacaqsınız? ");
        int biletSayi = sc.nextInt();

        int umumiMebleg = qiymet * biletSayi;

        System.out.println("Ümumi məbləğ: " + umumiMebleg + " AZN");

        sc.close();
    }
}
