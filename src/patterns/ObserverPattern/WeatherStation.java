package patterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements IObservable{
    private List<IObserver> observers = new ArrayList<>();
    private final Random rand = new Random();

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    public int getTemperature()
    {
        return rand.nextInt(50) - 20;
    }
}
