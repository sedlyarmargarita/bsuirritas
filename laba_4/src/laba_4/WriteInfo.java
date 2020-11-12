package laba_4;
public class WriteInfo {
    public static void main(String[] args) {

        Skillet skillet = new Skillet( "ital", 10, "a");
        skillet.print();
        Pan pan = new Pan("trad", 2, 15, "b");
        pan.print();
        Saladbowl saladbowl = new Saladbowl("vix", 22, 3, "c", 6, "sssalad");
        saladbowl.print();
        Saucer saucer = new Saucer("rnk", 10, 55,"f", 1, "sssaucer");
        saucer.print();
    }

}
