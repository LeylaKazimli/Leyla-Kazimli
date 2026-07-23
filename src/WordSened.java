class WordSened extends Sened {

    WordSened(String basliq) {
        super(basliq);
    }

    @Override
    void capEt() {
        System.out.println("Word sənədi çap olunur: " + basliq);
    }
}