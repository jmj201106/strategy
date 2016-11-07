package strategy;

public class Apple implements Discountable {
    private Discountor discountor;

    public Apple() {

    }

    public Apple(Discountor discountor) {
        this.discountor = discountor;
    }

    @Override
    public void discount() {
        discountor.discount();
    }

}
