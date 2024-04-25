package swp.basics.observer.pull.impl;

import swp.basics.observer.pull.Observable;
import swp.basics.observer.pull.Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class DefaultObservable implements Observable {

    private Set<Observer> registerObservers = new HashSet<>();
    @Override
    public void registerObserver(Observer observer) {
        registerObservers.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) {
        registerObservers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : registerObservers)
            observer.update();
    }


    public abstract Object getState();
}
