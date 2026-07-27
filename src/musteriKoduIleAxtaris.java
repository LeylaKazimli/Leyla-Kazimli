import java.util.HashMap;
import java.util.Scanner;

public class musteriKoduIleAxtaris {
    public static void main(String[] args) {

        // HashMap yarat
        HashMap<String, String> musteriler = new HashMap<>();

        // 4 müştəri əlavə et
        musteriler.put("M001", "Aysel");
        musteriler.put("M002", "Murad");
        musteriler.put("M003", "Elvin");
        musteriler.put("M004", "Nigar");

        // Scanner yarat
        Scanner sc = new Scanner(System.in);

        // İstifadəçidən müştəri kodunu al
        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = sc.nextLine();

        // Kodu yoxla
        if (musteriler.containsKey(kod)) {
            System.out.println("Müştərinin adı: " + musteriler.get(kod));
        } else {
            System.out.println("Belə müştəri tapılmadı.");
        }

        sc.close();
    }
}
