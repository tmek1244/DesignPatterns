package patterns.FactoryMethodPattern.Animals;

public class Duck implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Quack");
    }
}
