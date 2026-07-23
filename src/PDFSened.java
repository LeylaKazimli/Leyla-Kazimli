class PDFSened extends Sened {

    PDFSened(String basliq) {
        super(basliq);
    }

    @Override
    void capEt() {
        System.out.println("PDF sənədi çap olunur: " + basliq);
    }
}
