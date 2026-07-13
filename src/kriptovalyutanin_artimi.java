public class kriptovalyutanin_artimi {
    public static void main(String[] args) {

        // 1. Kriptovalyutanın ilkin qiymətini təyin edirik.
        double qiymet = 1000;

        // 2. İllərin sayını saxlamaq üçün dəyişən yaradırıq.
        int il = 0;

        // 3. Qiymət iki qatına çatana qədər dövr davam edir.
        while (qiymet < 2000) {

            // 4. Yeni il başladığı üçün il sayını artırırıq.
            il++;

            // 5. Qiyməti 8% artırırıq.
            qiymet = qiymet * 1.08;

            // 6. Hər ilin sonundakı qiyməti çap edirik.
            System.out.println("İl " + il + ": " + qiymet + " AZN");
        }

        // 7. Ümumi neçə il çəkdiyini çap edirik.
        System.out.println("Ümumi il sayı: " + il);
    }
}