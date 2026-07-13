import java.util.Scanner;

public class muzey_bileti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. İstifadəçidən yaşı alırıq.
        System.out.print("Yaşı daxil edin: ");
        int yas = sc.nextInt();

        // 2. Biletin qiymətini saxlamaq üçün dəyişən yaradırıq.
        int qiymet;

        // 3. Yaşa uyğun bilet qiymətini müəyyən edirik.
        if (yas >= 0 && yas <= 6) {
            qiymet = 0;
        } else if (yas >= 7 && yas <= 17) {
            qiymet = 2;
        } else if (yas >= 18 && yas <= 60) {
            qiymet = 5;
        } else {
            qiymet = 3;
        }

        // 4. Bir biletin qiymətini ekrana çıxarırıq.
        System.out.println("Bir biletin qiyməti: " + qiymet + " AZN");

        // 5. İstifadəçidən neçə bilet aldığını soruşuruq.
        System.out.print("Neçə bilet alırsınız? ");
        int biletSayi = sc.nextInt();

        // 6. Ümumi məbləği hesablayırıq.
        int umumi = qiymet * biletSayi;

        // 7. Ümumi məbləği ekrana çıxarırıq.
        System.out.println("Ümumi məbləğ: " + umumi + " AZN");
    }
}
