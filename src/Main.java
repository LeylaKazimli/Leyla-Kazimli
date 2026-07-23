public class Main {

    public static void main(String[] args) {

        depozit depozit = new depozit();
        kredit kredit = new kredit();

        depozit.balansGoster();
        depozit.faizHesabla();

        kredit.balansGoster();
        kredit.faizHesabla();

        // Hesab hesab = new Hesab();  // Xəta verəcək
    }
}