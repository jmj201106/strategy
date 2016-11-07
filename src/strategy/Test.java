package strategy;

public class Test {

    public static void main(String[] args) {
        Market m = new Market();
        // Discountor apd = new AppleByWeightDiscountor();
        // Discountor pd = new PearByQualityDiscountor();
        Discountor nod = new NoDiscount();
        Apple ap = new Apple(nod);
        Pear pear = new Pear(nod);
        m.setApple(ap);
        m.setPear(pear);
        m.sellApple();
        m.sellPear();
    }

}
