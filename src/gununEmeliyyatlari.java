import java.util.ArrayList;

public class gununEmeliyyatlari {
    public static void main(String[] args) {

        // ArrayList<Integer> yarat
        ArrayList<Integer> emeliyyatlar = new ArrayList<>();

        // 5 əməliyyat məbləği əlavə et
        emeliyyatlar.add(120);
        emeliyyatlar.add(250);
        emeliyyatlar.add(80);
        emeliyyatlar.add(500);
        emeliyyatlar.add(150);

        // Ümumi cəmi hesabla (for-each)
        int cem = 0;

        for (Integer mebleg : emeliyyatlar) {
            cem += mebleg;
        }

        // Cəmi çap et
        System.out.println("Ümumi məbləğ: " + cem);

        // Siyahını tam təmizlə
        emeliyyatlar.clear();

        // Siyahının boş olub-olmadığını yoxla
        System.out.println("Siyahı boşdur? " + emeliyyatlar.isEmpty());
    }
}