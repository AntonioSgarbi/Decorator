package tech.antoniosgarbi;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        super();
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }

}