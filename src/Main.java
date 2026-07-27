public class Main {

    public static void nagdCixar(double meblegh) throws LimitKecildiException {

        if (meblegh > 2000) {
            throw new LimitKecildiException("Gündəlik limit (2000 AZN) keçildi.");
        }

        System.out.println("Nağd çıxarıldı: " + meblegh + " AZN");
    }

    public static void main(String[] args) {

        try {
            nagdCixar(1500);
            nagdCixar(2500);
        }
        catch (LimitKecildiException e) {
            System.out.println(e.getMessage());
        }

    }
}