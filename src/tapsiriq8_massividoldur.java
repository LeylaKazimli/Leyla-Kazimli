public class tapsiriq8_massividoldur {
    public static void main(String[] args) {

        // Tapşırıq:
        // 8 elementli boş massiv yarat.
        // Adi for ilə 10, 20, 30 ... 80 dəyərləri ilə doldur.
        // Sonra for-each ilə bütün elementləri çap et.

        int[] ededler = new int[8];

        for (int i = 0; i < ededler.length; i++) {
            ededler[i] = (i + 1) * 10;
        }

        for (int eded : ededler) {
            System.out.print(eded + " ");
        }

    }
}
