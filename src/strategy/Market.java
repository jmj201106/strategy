package strategy;

public class Market {

    private Apple apple;
    private Pear pear;

    public void sellApple() {
        apple.discount();
    }

    public void sellPear() {
        pear.discount();
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Pear getPear() {
        return pear;
    }

    public void setPear(Pear pear) {
        this.pear = pear;
    }

}
