import java.util.ArrayList;

public class vipMusteriNovbesi {
    public static void main(String[] args) {

        // String tipində ArrayList yarat
        ArrayList<String> novbe = new ArrayList<>();

        // 4 müştəri əlavə et
        novbe.add("Aysel");
        novbe.add("Murad");
        novbe.add("Elvin");
        novbe.add("Nigar");

        // VIP müştərini növbənin əvvəlinə əlavə et
        novbe.add(0, "VIP");

        // "Murad" növbədə var?
        System.out.println("Murad növbədədir? " + novbe.contains("Murad"));

        // 2-ci indeksdəki adı dəyiş (Murad -> Kamran)
        novbe.set(2, "Kamran");

        // Siyahını adi for dövrü ilə çap et
        for (int i = 0; i < novbe.size(); i++) {
            System.out.println(i + ": " + novbe.get(i));
        }
    }
}
