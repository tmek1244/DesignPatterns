package patterns.StrategyPattern.moving;

public class InTheAir implements IMovingBehavior{

    @Override
    public void move() {
        System.out.println("Flying");
    }
}
