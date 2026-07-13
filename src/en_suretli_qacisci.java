import java.util.Scanner;

public class en_suretli_qacisci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Üç qaçışçının vaxtını istifadəçidən alırıq.
        System.out.print("1-ci qaçışçının vaxtı: ");
        double vaxt1 = sc.nextDouble();

        System.out.print("2-ci qaçışçının vaxtı: ");
        double vaxt2 = sc.nextDouble();

        System.out.print("3-cü qaçışçının vaxtı: ");
        double vaxt3 = sc.nextDouble();

        // 2. Əvvəlcə 1-ci qaçışçını ən sürətli hesab edirik.
        double enAzVaxt = vaxt1;
        int qalibNomresi = 1;

        // 3. Əgər 2-ci qaçışçı daha az vaxt sərf edibsə,
        // onu ən sürətli kimi yadda saxlayırıq.
        if (vaxt2 < enAzVaxt) {
            enAzVaxt = vaxt2;
            qalibNomresi = 2;
        }

        // 4. Əgər 3-cü qaçışçı daha az vaxt sərf edibsə,
        // onu ən sürətli kimi yadda saxlayırıq.
        if (vaxt3 < enAzVaxt) {
            enAzVaxt = vaxt3;
            qalibNomresi = 3;
        }

        // 5. Ən sürətli qaçışçının nömrəsini və vaxtını çap edirik.
        System.out.println("Ən sürətli qaçışçı: " + qalibNomresi);
        System.out.println("Vaxtı: " + enAzVaxt + " saniyə");

        sc.close();
    }
}