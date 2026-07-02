import java.util.Scanner;

public class Tapsiriq8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius derecesini daxil edin: ");
        int c = sc.nextInt();

        double f1 = c * 9 / 5 + 32;

        double f2 = c * 9.0 / 5 + 32;

        System.out.println("1-ci variant: " + f1);
        System.out.println("2-ci variant: " + f2);

        // 9 / 5 = 1 olur, çünki int / int = int.
        // 9.0 / 5 = 1.8 olur, çünki double / int = double.
    }
}