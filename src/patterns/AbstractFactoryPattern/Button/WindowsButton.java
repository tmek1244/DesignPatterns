package patterns.AbstractFactoryPattern.Button;

public class WindowsButton implements Button{

    @Override
    public void press() {
        System.out.println("Button pressed on windows");
    }
}
