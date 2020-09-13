package patterns.DecoratorPattern;

public abstract class AddonDecorator extends Beverage {
    protected Beverage beverage;

    public AddonDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }
}
