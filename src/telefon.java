class Telefon {

    private int batareya;

    public void setBatareya(int batareya) {
        if (batareya >= 0 && batareya <= 100) {
            this.batareya = batareya;
        } else {
            System.out.println("Xəta!Batareya faizi 0-100 aralığında olmalıdır.");
        }
    }

    public int getBatareya() {
        return batareya;
    }
}
