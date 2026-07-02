import java.util.Scanner;

    public class Tapsiriq10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ad və soyad daxil edin: ");
        String fullName = sc.nextLine();

        System.out.print("Yaşınızı daxil edin: ");
        int age = sc.nextInt();

        sc.nextLine(); // Enter-i təmizləyir

        System.out.print("İllik gəlirinizi daxil edin: ");
        String incomeText = sc.nextLine();

        double income = Double.parseDouble(incomeText);

        // Şərtlər
        boolean validName = fullName.contains(" ") && fullName.length() >= 5;
        boolean validAge = age >= 18 && age <= 70;
        boolean validIncome = income >= 3000;

        boolean result = validName && validAge && validIncome;

        // Hesabat
        System.out.printf(
                "Ad-Soyad: %s%nYaş: %d%nGəlir: %.2f AZN%nAd düzgündür: %b%nYaş uyğundur: %b%nGəlir uyğundur: %b%nMüraciət qəbul olunur: %b",
                fullName.toUpperCase(),
                age,
                income,
                validName,
                validAge,
                validIncome,
                result
        );

        sc.close();
    }
}