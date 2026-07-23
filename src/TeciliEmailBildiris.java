public class TeciliEmailBildiris extends EmailBildiriss {

    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Təcili email göndərildi.");
    }

}