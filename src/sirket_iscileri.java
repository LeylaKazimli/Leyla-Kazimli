public class sirket_iscileri {

    public static void main(String[] args) {

        Menecer menecer = new Menecer();
        menecer.setAd("Leyla");
        menecer.ozunuTeqdimEt();
        menecer.idareEt();

        Developer developer = new Developer();
        developer.setAd("Aysel");
        developer.ozunuTeqdimEt();
        developer.kodYaz();
    }
}