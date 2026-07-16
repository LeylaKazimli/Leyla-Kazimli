public class tapsiriq8_salamlasma {
    public static void main(String[] args) {

        // Tapşırıq:
        // Massivdəki bütün adlar üçün
        // "Salam, AD!" formatında mesaj çap et.
        // for-each dövrəsindən istifadə et.

        String[] adlar = {"Aysel", "Murad", "Leyla", "Tural"};

        for (String ad : adlar) {
            System.out.println("Salam, " + ad + "! Əleykum salam :D");
        }

    }
}
