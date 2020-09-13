package patterns.DecoratorPattern;

public class SoyDecorator extends AddonDecorator{
    public SoyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 2 + this.beverage.cost();
    }

    @Override
    public String getDescription()
    {
        return this.beverage.getDescription() + " with soy milk";
    }
}
