public class EmailBildiriss extends Bildiriss {

    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Email vasitəsilə göndərildi.");
    }

}
