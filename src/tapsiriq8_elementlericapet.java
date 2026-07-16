public class tapsiriq8_elementlericapet  {
    public static void main(String[] args) {

        // Tapşırıq:
        // Massivin bütün elementlərini
        // for-each dövrəsindən istifadə edərək
        // hər birini yeni sətirdə çap et.
        // Sonda length istifadə edərək
        // elementlərin sayını ekrana çıxar.

        int[] ededler = {4, 8, 15, 16, 23, 42};

        for (int eded : ededler) {
            System.out.println(eded);
        }

        System.out.println("Element sayı: " + ededler.length);

    }
}
