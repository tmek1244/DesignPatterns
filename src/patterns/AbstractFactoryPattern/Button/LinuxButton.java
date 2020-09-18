package patterns.AbstractFactoryPattern.Button;

public class LinuxButton implements Button{
    @Override
    public void press() {
        System.out.println("Button pressed on linux");
    }
}
