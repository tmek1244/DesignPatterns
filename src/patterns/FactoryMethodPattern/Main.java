package patterns.FactoryMethodPattern;

import patterns.FactoryMethodPattern.Animals.Animal;
import patterns.FactoryMethodPattern.Animals.Cat;
import patterns.FactoryMethodPattern.Animals.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var animalFactory = new RandomAnimalFactory();
        Animal randomAnimal1 = animalFactory.creatAnimal();
        Animal randomAnimal2 = animalFactory.creatAnimal();
        var excludedAnimals = new ArrayList<Class<? extends Animal>>();
        excludedAnimals.add(Dog.class);
        excludedAnimals.add(Cat.class);
        System.out.println("Random factory:");
        Animal randomAnimal3 = animalFactory.creatAnimal(excludedAnimals);

        randomAnimal1.makeNoise();
        randomAnimal2.makeNoise();
        randomAnimal3.makeNoise();

        System.out.println("Balance factory:");
        var balanceAnimalFactory = new BalanceAnimalFactory();
        randomAnimal1 = balanceAnimalFactory.creatAnimal();
        randomAnimal2 = balanceAnimalFactory.creatAnimal();
        randomAnimal3 = balanceAnimalFactory.creatAnimal();

        randomAnimal1.makeNoise();
        randomAnimal2.makeNoise();
        randomAnimal3.makeNoise();
    }
}
