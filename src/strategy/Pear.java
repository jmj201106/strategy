package strategy;

public class Pear implements Discountable {

    private Discountor discountor;

    public Pear() {

    }

    public Pear(Discountor discountor) {
        this.discountor = discountor;
    }

    @Override
    public void discount() {
        discountor.discount();
    }

}
