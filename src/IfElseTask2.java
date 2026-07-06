// İstifadəçidən 3 tam ədəd alır, ən böyük və ən kiçik ədədi tapıb çap edir.

import java.util.Scanner;

    public class IfElseTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = sc.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = sc.nextInt();

        System.out.print("Üçüncü ədədi daxil edin: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Ən böyük: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Ən böyük: " + b);
        } else {
            System.out.println("Ən böyük: " + c);
        }

        if (a <= b && a <= c) {
            System.out.println("Ən kiçik: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Ən kiçik: " + b);
        } else {
            System.out.println("Ən kiçik: " + c);
        }
    }
}