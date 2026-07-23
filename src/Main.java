public class Main {

    public static void main(String[] args) {

        test[] testler = {
                new UITest(),
                new APITest(),
                new DBTest()
        };

        for (test t : testler) {
            t.icraEt();
        }
    }
}