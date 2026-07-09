import java.util.Scanner;

    public class tapshiriq7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gizli = 42;
        int texmin;
        int cehd = 0;

        while (true) {

            System.out.print("Bir ədəd daxil edin: ");
            texmin = sc.nextInt();

            cehd = cehd + 1;

            if (texmin > gizli) {
                System.out.println("Böyükdür");
            } else if (texmin < gizli) {
                System.out.println("Kiçikdir");
            } else {
                System.out.println("Tapdın!");
                break;
            }
        }

        System.out.println("Cəhd sayı: " + cehd);

        sc.close();
    }
}
