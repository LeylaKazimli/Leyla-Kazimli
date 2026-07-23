public class Main {
    public static void main(String[] args) {

        Bildiris bildiris = new Bildiris();
        bildiris.gonder();

        System.out.println();

        EmailBildiris email = new EmailBildiris();
        email.gonder();

        System.out.println();

        TeciliEmailBildiris tecili = new TeciliEmailBildiris();
        tecili.gonder();
    }
}