package swp.basics.observer.push.impl;

import swp.basics.observer.push.Observable;
import swp.basics.observer.push.Observer;

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
            observer.update(this, getState());
    }

    public abstract Object getState();
}
