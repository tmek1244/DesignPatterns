package patterns.DecoratorPattern;

public abstract class Beverage {
    public String getDescription()
    {
        return "No description";
    }

    public int cost()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return this.getDescription() + " for " + this.cost();
    }
}
