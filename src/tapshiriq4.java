import java.util.Scanner;

    public class tapshiriq4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int enCoxQol = 0;
        int oyuncuNomresi = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". oyunçunun qol sayını daxil edin: ");
            int qol = sc.nextInt();

            if (qol > enCoxQol) {
                enCoxQol = qol;
                oyuncuNomresi = i;
            }
        }

        System.out.println("Ən çox qol vuran oyunçu: " + oyuncuNomresi);
        System.out.println("Qol sayı: " + enCoxQol);

        sc.close();
    }
}
