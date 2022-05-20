package tech.antoniosgarbi.main;

import tech.antoniosgarbi.*;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Expresso();

        System.out.println(beverage.getDescription()+"$ "+ beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription()+ " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();

        beverage3 = new Soy(beverage3);

        System.out.println(beverage3.getDescription()+ " $ " + beverage3.cost());

    }

}