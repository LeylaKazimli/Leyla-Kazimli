import java.util.Scanner;

    public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci tam ededi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("Ikinci tam ededi daxil edin: ");
        int b = sc.nextInt();

        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Toplama: " + sum);
        System.out.println("Cixma: " + subtraction);
        System.out.println("Vurma: " + multiplication);
        System.out.println("Bolme: " + division);
        System.out.println("Qaliq: " + remainder);

        // int / int = int oldugu ucun ondalıq hissə silinir.
        // Meselen: 17 / 5 = 3 olur, 3.4 olmur.
    }
}
