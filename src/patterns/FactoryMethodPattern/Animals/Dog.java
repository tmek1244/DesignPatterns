package patterns.FactoryMethodPattern.Animals;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("woof-woof");
    }
}
