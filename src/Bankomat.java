class Bankomat {

    private double balans = 1000;

    public void pulCek(double mebleg) {

        if (yoxla(mebleg)) {
            balans -= mebleg;
            System.out.println("Çəkilən məbləğ: " + mebleg);
            System.out.println("Qalıq balans: " + balans);
        } else {
            System.out.println("Balans kifayət etmir.");
        }

    }

    private boolean yoxla(double mebleg) {
        return mebleg <= balans;
    }

}
