package strategy;

public class PearByQualityDiscountor implements Discountor {

    @Override
    public void discount() {
        System.out.println("pear discount by quality");
    }

}
