public class TeciliEmailBildiris extends EmailBildiris {

    @Override
    public void gonder() {
        super.gonder();
        System.out.println("Təcili email göndərildi.");
    }

}