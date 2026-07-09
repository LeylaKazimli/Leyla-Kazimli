import java.util.Scanner;

    public class tapshiriq6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Mobil nömrənin kodunu daxil edin: ");
        String kod = sc.next();

        switch (kod) {
            case "050":
            case "051":
                System.out.println("Operator: Azercell");
                break;

            case "055":
            case "099":
                System.out.println("Operator: Bakcell");
                break;

            case "070":
            case "077":
                System.out.println("Operator: Nar");
                break;

            default:
                System.out.println("Naməlum operator");
        }

        sc.close();
    }
}
