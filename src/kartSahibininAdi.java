public class kartSahibininAdi {
    public static void main(String[] args) {

        String kartSahibi = null;

        try {
            System.out.println("Simvol sayı: " + kartSahibi.length());
        }
        catch (NullPointerException e) {
            System.out.println("Kart məlumatı tapılmadı");
        }
        finally {
            System.out.println("Sessiya bağlandı");
        }

    }
}
