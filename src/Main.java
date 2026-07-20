public class Main {

    public static void main(String[] args) {

        Bildiris[] bildirisler = {
                new EmailBildiris(),
                new SmsBildiris(),
                new PushBildiris()
        };

        for (int i = 0; i < bildirisler.length; i++) {
            bildirisler[i].gonder();
        }

    }

}