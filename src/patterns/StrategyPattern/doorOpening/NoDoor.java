package patterns.StrategyPattern.doorOpening;

public class NoDoor implements IDoorOpeningBehavior{
    @Override
    public void openTheDoor() {
        System.out.println("There is no door to open");
    }
}
