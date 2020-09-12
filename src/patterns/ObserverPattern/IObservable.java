package patterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
}
