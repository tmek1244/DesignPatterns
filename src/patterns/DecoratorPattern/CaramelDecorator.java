package patterns.DecoratorPattern;

public class CaramelDecorator extends AddonDecorator{

    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 3 + this.beverage.cost();
    }

    @Override
    public String getDescription()
    {
        return this.beverage.getDescription() + " with Caramel";
    }
}
