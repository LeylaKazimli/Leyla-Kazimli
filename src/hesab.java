class Hesab {

    String ad;
    double balans;

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void medaxilEt(double mebleg) {
        balans += mebleg;
    }

    public void goster() {
        System.out.println("Hesab sahibi: " + ad);
        System.out.println("Balans: " + balans);
    }

}
