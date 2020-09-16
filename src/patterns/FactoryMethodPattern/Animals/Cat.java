package patterns.FactoryMethodPattern.Animals;

public class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
