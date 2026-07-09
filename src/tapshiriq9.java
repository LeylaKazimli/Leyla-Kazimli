import java.util.Scanner;

    public class tapshiriq9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secim;

        while (true) {

            System.out.println("------ MENYU ------");
            System.out.println("1. Cəm");
            System.out.println("2. Fərq");
            System.out.println("3. Hasil");
            System.out.println("4. Bölmə");
            System.out.println("0. Çıxış");
            System.out.print("Seçiminizi edin: ");

            secim = sc.nextInt();

            if (secim == 0) {
                System.out.println("Proqramdan çıxılır...");
                break;
            }

            System.out.print("Birinci ədədi daxil edin: ");
            double eded1 = sc.nextDouble();

            System.out.print("İkinci ədədi daxil edin: ");
            double eded2 = sc.nextDouble();

            switch (secim) {

                case 1:
                    System.out.println("Nəticə: " + (eded1 + eded2));
                    break;

                case 2:
                    System.out.println("Nəticə: " + (eded1 - eded2));
                    break;

                case 3:
                    System.out.println("Nəticə: " + (eded1 * eded2));
                    break;

                case 4:
                    if (eded2 == 0) {
                        System.out.println("0-a bölmək olmaz!");
                    } else {
                        System.out.println("Nəticə: " + (eded1 / eded2));
                    }
                    break;

                default:
                    System.out.println("Yanlış seçim!");
            }

            System.out.println();
        }

        sc.close();
    }
}
