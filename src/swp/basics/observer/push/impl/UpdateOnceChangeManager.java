package swp.basics.observer.push.impl;

import swp.basics.observer.push.Observable;
import swp.basics.observer.push.Observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UpdateOnceChangeManager {

    static UpdateOnceChangeManager instance;
    Map<Observable, Set<Observer>> obsObsMap;

    ChangeCollector collector = new ChangeCollector();

    private UpdateOnceChangeManager() {
        obsObsMap = new HashMap<>();
    }

    public static UpdateOnceChangeManager getInstance() {
        if (instance == null) {
            instance = new UpdateOnceChangeManager();
        }
        return instance;
    }

    public void attachObserver(Observable subject, Observer observer) {
        //check if observable exists
        if (!obsObsMap.containsKey(subject)) {
            obsObsMap.put(subject, new HashSet<>());
        }
        obsObsMap.get(subject).add(observer);

        subject.registerObserver(collector);
    }
    // detach, unregister

    private class ChangeCollector implements Observer {

        boolean blockUpdate = false;

        @Override
        public void update(Observable observable, Object argument) { //get updated once
            if (!blockUpdate) {
                blockUpdate = true;
                if (obsObsMap.containsKey(observable)) {
                    Set<Observer> observers = obsObsMap.get(observable);
                    Set<Observer> allObservers = new HashSet<>();
                    if (!observers.isEmpty()) {
                        searchObserversRec(observers, allObservers);
                    }

                    for (Observer o : allObservers) {
                        o.update(observable, argument); //update (observable) observer
                    }
                }
                blockUpdate = false;
            }
        }


        private void searchObserversRec(Set<Observer> observers, Set<Observer> allObservers) {
            for (Observer o : observers) {
                if (!allObservers.contains(o)) {
                    allObservers.add(o);
                    Set<Observer> tmp = obsObsMap.get((Observable) o);
                    if (tmp != null && !tmp.isEmpty()) {
                        searchObserversRec(tmp, allObservers);
                    }
                }
            }
        }
    }
}

