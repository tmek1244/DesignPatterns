package patterns.FactoryMethodPattern;

import patterns.FactoryMethodPattern.Animals.Animal;
import patterns.FactoryMethodPattern.Animals.Cat;
import patterns.FactoryMethodPattern.Animals.Dog;
import patterns.FactoryMethodPattern.Animals.Duck;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AnimalFactory {
    public abstract Animal creatAnimal();

    protected Animal createRandomAnimal(ArrayList<Class<? extends Animal>> excludedAnimals) {
        var rand = new Random();

        var animals = new ArrayList<Class<? extends Animal>>();

        animals.add(Dog.class);
        animals.add(Cat.class);
        animals.add(Duck.class);

        if(excludedAnimals != null)
            animals.removeAll(excludedAnimals);
        try {
            Class<? extends Animal> animalClass = animals.get(rand.nextInt(animals.size()));
            Constructor<? extends Animal> constructor = animalClass.getConstructor();
            return constructor.newInstance();
        }
        catch (NoSuchMethodException e)
        {
            System.out.println("No such method exception - getConstructor(): " + e);
            return null;
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("NewInstance() exception: " + e);
            return null;
        }

    }
}
