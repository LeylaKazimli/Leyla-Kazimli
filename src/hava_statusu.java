import java.util.Scanner;

public class hava_statusu {
    public static void main(String[] args) {

        // 1. Tapşırığı parçalayıram:
        // - İstifadəçidən temperatur alınmalıdır.
        // - Temperatur tam ədəddir → int istifadə edirəm.
        // - Temperatur aralıqlara görə yoxlanılır → if / else if / else istifadə edirəm.
        // - Nəticə "Temperatur: X°C → Status: Y" formatında çap olunmalıdır.

        // Scanner yaradıram ki, istifadəçidən məlumat ala bilim.
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən temperaturu alıram.
        System.out.print("Temperaturu daxil edin: ");
        int temperatur = sc.nextInt();

        // Statusu saxlamaq üçün String dəyişəni yaradıram.
        String status;

        // Temperatur 25-dən böyükdürsə
        if (temperatur > 25) {
            status = "İsti";

            // Temperatur 15-25 arasındadırsa
        } else if (temperatur >= 15 && temperatur <= 25) {
            status = "Mülayim";

            // Temperatur 0-14 arasındadırsa
        } else if (temperatur >= 0 && temperatur <= 14) {
            status = "Soyuq";

            // Əks halda temperatur 0-dan kiçikdir
        } else {
            status = "Şaxta";
        }

        // Nəticəni ekrana çıxarıram.
        System.out.println("Temperatur: " + temperatur + "°C → Status: " + status);

        // Scanner-i bağlayıram.
        sc.close();
    }
}
