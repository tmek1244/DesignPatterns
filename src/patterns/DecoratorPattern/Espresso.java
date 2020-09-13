package patterns.DecoratorPattern;

public class Espresso extends Beverage {
    @Override
    public int cost() {
        return 11;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
