package patterns.FactoryMethodPattern;

import patterns.FactoryMethodPattern.Animals.Animal;
import patterns.FactoryMethodPattern.Animals.Cat;
import patterns.FactoryMethodPattern.Animals.Dog;
import patterns.FactoryMethodPattern.Animals.Duck;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

public class RandomAnimalFactory extends AnimalFactory {

    public Animal creatAnimal(ArrayList<Class<? extends Animal>> excludedAnimals)
    {
        return createRandomAnimal(excludedAnimals);
    }

    @Override
    public Animal creatAnimal() {
        return creatAnimal(null);
    }
}
