class Telebebali {

    private String ad;
    private int bal;

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBal(int bal) {
        if (bal >= 0 && bal <= 100) {
            this.bal = bal;
        } else {
            System.out.println("Xəta! Bal 0-100 aralığında olmalıdır.");
        }
    }

    public String getAd() {
        return ad;
    }

    public String getNetice() {

        String qiymet;

        if (bal >= 90) {
            qiymet = "Əla";
        } else if (bal >= 70) {
            qiymet = "Yaxşı";
        } else if (bal >= 50) {
            qiymet = "Kafi";
        } else {
            qiymet = "Qeyri-kafi";
        }

        return "Ad: " + ad + ", Bal: " + bal + ", Qiymət: " + qiymet;
    }
}