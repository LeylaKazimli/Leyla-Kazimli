public class tapsiriq8_minveindeksi {
    public static void main(String[] args) {

        // Tapşırıq:
        // Massivdə ən kiçik balı və
        // onun indeksini tap.

        int[] ballar = {45, 78, 92, 30, 65, 88};

        int min = ballar[0];
        int indeks = 0;

        for (int i = 1; i < ballar.length; i++) {

            if (ballar[i] < min) {
                min = ballar[i];
                indeks = i;
            }

        }

        System.out.println("Ən kiçik bal: " + min);
        System.out.println("İndeksi: " + indeks);

    }
}