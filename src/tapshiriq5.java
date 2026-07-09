import java.util.Scanner;

    public class tapshiriq5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("İlkin əmanət məbləğini daxil edin: ");
        double mebleg = sc.nextDouble();

        System.out.print("İllik faiz dərəcəsini daxil edin: ");
        double faiz = sc.nextDouble();

        double ilkinMebleg = mebleg;
        int il = 0;

        while (mebleg < ilkinMebleg * 2) {

            mebleg = mebleg + (mebleg * faiz / 100);
            il++;

            System.out.println(il + ". ilin sonunda məbləğ: " + mebleg);
        }

        System.out.println("Əmanətin iki qatına çatması üçün " + il + " il lazım oldu.");

        sc.close();
    }
}
