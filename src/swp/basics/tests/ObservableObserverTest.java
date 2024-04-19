package swp.basics.tests;

import swp.basics.observer.push.Observer;
import swp.basics.observer.push.impl.ConcreteObserver;
import swp.basics.observer.push.impl.TimerObservable;
import swp.basics.observer.push.impl.TimerObservableObserver;

public class ObservableObserverTest {

    public static void main(String[] args) throws InterruptedException {
        TimerObservable timer = new TimerObservable(10, 100);
        TimerObservableObserver obObs1 = new TimerObservableObserver(10, 100);
        TimerObservableObserver obObs2 = new TimerObservableObserver(10, 100);
        Observer obs = new ConcreteObserver();

        timer.registerObserver(obObs1);
        timer.registerObserver(obObs2);
        obObs1.registerObserver(obs);
        obObs2.registerObserver(obs);

        timer.runTimer();
    }
}
