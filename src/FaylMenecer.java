class FaylMenecer implements Yuklene, Endirile {

    @Override
    public void yukle() {
        System.out.println("Fayl yükləndi.");
    }

    @Override
    public void endir() {
        System.out.println("Fayl endirildi.");
    }
}