package patterns.DecoratorPattern;

public class Decaf extends Beverage{
    @Override
    public int cost() {
        return 8;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
