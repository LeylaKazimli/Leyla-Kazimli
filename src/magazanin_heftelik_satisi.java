import java.util.Scanner;

public class magazanin_heftelik_satisi {
    public static void main(String[] args) {

        // 1. Tapşırığı parçalayıram:
        // - İstifadəçidən 3 günün satış məbləğini alacağam.
        // - Satış məbləği pul olduğu üçün double istifadə edəcəyəm.
        // - Ümumi satışı hesablayacağam.
        // - Orta günlük satışı hesablayacağam.
        // - Orta satış 500 AZN-dən böyükdürsə "Həftə uğurludur",
        //   əks halda "Satışı artırmaq lazımdır" yazacağam.
        // - Ümumi məbləği və orta satışı ekrana çıxaracağam.

        // İstifadəçidən məlumat almaq üçün Scanner yaradıram.
        Scanner sc = new Scanner(System.in);

        // 1-ci günün satışını alıram.
        System.out.print("1-ci günün satışı: ");
        double gun1 = sc.nextDouble();

        // 2-ci günün satışını alıram.
        System.out.print("2-ci günün satışı: ");
        double gun2 = sc.nextDouble();

        // 3-cü günün satışını alıram.
        System.out.print("3-cü günün satışı: ");
        double gun3 = sc.nextDouble();

        // Ümumi satışı hesablayıram.
        double umumi = gun1 + gun2 + gun3;

        // Orta günlük satışı hesablayıram.
        double orta = umumi / 3;

        // Ümumi satışı ekrana çıxarıram.
        System.out.println("Ümumi satış: " + umumi + " AZN");

        // Orta satışı ekrana çıxarıram.
        System.out.println("Orta günlük satış: " + orta + " AZN");

        // Orta satışa görə nəticəni müəyyən edirəm.
        if (orta > 500) {
            System.out.println("Həftə uğurludur");
        } else {
            System.out.println("Satışı artırmaq lazımdır");
        }

        // Scanner-i bağlayıram.
        sc.close();
    }
}
