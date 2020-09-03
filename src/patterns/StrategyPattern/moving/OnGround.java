package patterns.StrategyPattern.moving;

public class OnGround implements IMovingBehavior{
    @Override
    public void move() {
        System.out.println("Moving on the ground");
    }
}
