package patterns.AbstractFactoryPattern.Button;

public class MacButton implements Button{
    @Override
    public void press() {
        System.out.println("Button pressed on Mac");
    }
}
