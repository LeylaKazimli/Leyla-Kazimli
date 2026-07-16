public class tapsiriq8_eslkopya {
    public static void main(String[] args) {

        // Tapşırıq:
        // Massivin əsl kopyasını yarat.
        // Sonra kopyanın ilk elementini 99 et.
        // Hər iki massivi ayrıca çap et.

        int[] orijinal = {5, 10, 15, 20};

        int[] kopya = new int[orijinal.length];

        for (int i = 0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }

        kopya[0] = 99;

        System.out.println("Orijinal massiv:");

        for (int eded : orijinal) {
            System.out.print(eded + " ");
        }

        System.out.println();

        System.out.println("Kopya massiv:");

        for (int eded : kopya) {
            System.out.print(eded + " ");
        }

    }
}