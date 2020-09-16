package patterns.FactoryMethodPattern;

import patterns.FactoryMethodPattern.Animals.Animal;

import java.util.ArrayList;

public class BalanceAnimalFactory extends AnimalFactory {
    private ArrayList<Class<? extends Animal>> excludedAnimals;
    private final ArrayList<Class<? extends Animal>> alreadyUsedAnimals = new ArrayList<>();
    public BalanceAnimalFactory()
    {
        new BalanceAnimalFactory(null);
    }

    public BalanceAnimalFactory(ArrayList<Class<? extends Animal>> excludedAnimals)
    {
        this.excludedAnimals = excludedAnimals;
    }

    @Override
    public Animal creatAnimal() {
        var allExcludedAnimals = new ArrayList<Class<? extends Animal>>();
        if(!this.alreadyUsedAnimals.isEmpty())
            allExcludedAnimals.addAll(this.alreadyUsedAnimals);
        if(this.excludedAnimals != null)
            allExcludedAnimals.addAll(this.excludedAnimals);

        var nextAnimal = super.createRandomAnimal(allExcludedAnimals);
        this.alreadyUsedAnimals.add(nextAnimal.getClass());
        return nextAnimal;
    }

}
