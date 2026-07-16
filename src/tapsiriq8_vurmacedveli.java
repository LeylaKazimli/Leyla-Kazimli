public class tapsiriq8_vurmacedveli {
    public static void main(String[] args) {

        // Tapşırıq:
        // do-while dövrəsindən istifadə edərək
        // 2-nin vurma cədvəlini 1-dən 10-a qədər
        // 2 x 1 = 2 formatında ekrana çap etmək.

        int i = 1; // Sayğacı 1-dən başlayırıq.

        do {
            System.out.println("2 x " + i + " = " + (2 * i));
            i++; // Sayğacı 1 vahid artırır.
        } while (i <= 10); // i 10-a qədər olduğu müddətdə dövrə davam edir.

    }
}
