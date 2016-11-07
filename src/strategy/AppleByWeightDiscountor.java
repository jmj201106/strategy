package strategy;

public class AppleByWeightDiscountor implements Discountor {

    @Override
    public void discount() {
        System.out.println("apple discount by weight");
    }

}
