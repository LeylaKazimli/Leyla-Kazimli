import java.util.Scanner;

public class ortaEmeliyyatMeblegi {
    public static void main(String[] args) {

        int umumiXerc = 1240;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Əməliyyat sayını daxil edin: ");
            int emeliyyatSayi = sc.nextInt();

            int ortaMebleg = umumiXerc / emeliyyatSayi;

            System.out.println("Orta əməliyyat məbləği: " + ortaMebleg);
        }
        catch (ArithmeticException e) {
            System.out.println("Xəta: Əməliyyat sayı 0 ola bilməz.");
        }
        catch (Exception e) {
            System.out.println("Xəta baş verdi.");
        }
        finally {
            System.out.println("Hesabat tamamlandı");
        }

        sc.close();
    }
}