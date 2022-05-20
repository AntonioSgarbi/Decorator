package tech.antoniosgarbi;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {

        double cost = beverage.cost();

        if (getSize() == BeverageSize.SMALL) {
            cost += 0.10;
        } else if (getSize() == BeverageSize.LARGE) {
            cost += 0.15;
        } else if (getSize() == BeverageSize.MEDIUM) {
            cost += 0.20;
        }
        return cost;
    }
}