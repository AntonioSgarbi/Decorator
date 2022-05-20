package tech.antoniosgarbi;
public abstract class Beverage {

    private BeverageSize beverageSize;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public BeverageSize getSize()  {
        return beverageSize;
    }

    public void setSize(BeverageSize beverageSize) {
        this.beverageSize = beverageSize;
    }

}