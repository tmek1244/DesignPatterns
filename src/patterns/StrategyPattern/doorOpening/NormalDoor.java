package patterns.StrategyPattern.doorOpening;

public class NormalDoor implements IDoorOpeningBehavior{

    @Override
    public void openTheDoor() {
        System.out.println("Opening the door");
    }
}
