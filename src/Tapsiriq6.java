import java.util.Scanner;

public class Tapsiriq6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ededi String kimi daxil edin: ");
        String reqem = sc.next();

        int eded = Integer.parseInt(reqem);

        int netice = eded + 100;

        String neticeMetn = String.valueOf(netice);

        int uzunluq = neticeMetn.length();

        System.out.println("Ededin int formasi: " + eded);
        System.out.println("Riyazi emeliyyatin neticesi: " + netice);
        System.out.println("String formasi: " + neticeMetn);
        System.out.println("Uzunlugu: " + uzunluq);
    }
}
