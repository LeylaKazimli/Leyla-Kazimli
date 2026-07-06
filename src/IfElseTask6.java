
     import java.util.Scanner;

    public class IfElseTask6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ededi daxil edin: ");
        double num1 = sc.nextDouble();

        System.out.print("Ikinci ededi daxil edin: ");
        double num2 = sc.nextDouble();

        System.out.print("Emeliyyat isaresini daxil edin (+, -, *, /): ");
        String operation = sc.next();

        switch (operation) {

            case "+":
                System.out.println("Netice: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Netice: " + (num1 - num2));
                break;

            case "*":
                System.out.println("Netice: " + (num1 * num2));
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("0-a bolmek olmaz!");
                } else {
                    System.out.println("Netice: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Namelum emeliyyat!");
        }
    }
}
