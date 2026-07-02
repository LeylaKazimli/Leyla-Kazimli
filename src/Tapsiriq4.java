import java.util.Scanner;

public class Tapsiriq4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci ededi daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Evvel:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;

        System.out.println("1-ci addim:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = a - b;

        System.out.println("2-ci addim:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a - b;

        System.out.println("3-cu addim:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}