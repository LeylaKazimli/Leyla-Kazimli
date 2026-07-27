import java.util.HashMap;
import java.util.Map;

public class filialHesabati {
    public static void main(String[] args) {

        // HashMap yarat
        HashMap<String, Integer> filiallar = new HashMap<>();

        // 4 filial əlavə et
        filiallar.put("Bakı", 120);
        filiallar.put("Sumqayıt", 85);
        filiallar.put("Gəncə", 95);
        filiallar.put("Şəki", 60);

        // Cüt sayını çap et
        System.out.println("Filial sayı: " + filiallar.size());

        // Bütün cütləri çap et
        for (Map.Entry<String, Integer> filial : filiallar.entrySet()) {
            System.out.println(filial.getKey() + " -> " + filial.getValue());
        }

        // Bir filialı sil
        filiallar.remove("Şəki");

        // Yenidən cüt sayını çap et
        System.out.println("Silindikdən sonra filial sayı: " + filiallar.size());
    }
}