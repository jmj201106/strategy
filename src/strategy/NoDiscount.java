package strategy;

public class NoDiscount implements Discountor {

    @Override
    public void discount() {
        System.out.println("no discount");
    }

}
