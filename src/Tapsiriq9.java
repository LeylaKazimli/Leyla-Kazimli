import java.util.Scanner;

    public class Tapsiriq9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: ");
        String email = sc.nextLine();

        // 1. @ varmı?
        boolean hasAt = email.contains("@");

        // 2. . varmı?
        boolean hasDot = email.contains(".");

        // 3. @-dən əvvəl ən azı 2 simvol varmı?
        boolean hasTwoBeforeAt = email.indexOf("@") >= 2;

        // Nəticələri göstər
        System.out.println("@ var? " + hasAt);
        System.out.println(". var? " + hasDot);
        System.out.println("@-dən əvvəl 2+ simvol var? " + hasTwoBeforeAt);

        sc.close();
    }
}