package patterns.StrategyPattern.moving;

public class OnWater implements IMovingBehavior{

    @Override
    public void move() {
        System.out.println("Moving on water");
    }
}
