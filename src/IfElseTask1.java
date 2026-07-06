// İstifadəçidən bir tam ədəd alır.
// Ədədin cüt və ya tək, müsbət, mənfi və ya sıfır olduğunu çap edir.

import java.util.Scanner;

    public class IfElseTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tam ədəd daxil edin: ");
        int reqem = sc.nextInt();

        if (reqem % 2 == 0) {
            System.out.println("Ədəd cütdür.");
        } else {
            System.out.println("Ədəd təkdir.");
        }

        if (reqem > 0) {
            System.out.println("Ədəd müsbətdir.");
        } else if (reqem < 0) {
            System.out.println("Ədəd mənfidir.");
        } else {
            System.out.println("Ədəd sıfırdır.");
        }
    }
}