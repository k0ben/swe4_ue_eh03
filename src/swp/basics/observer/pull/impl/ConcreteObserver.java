package swp.basics.observer.pull.impl;

import swp.basics.observer.pull.Observable;
import swp.basics.observer.pull.Observer;

public class ConcreteObserver implements Observer {

    Observable observable;

    public ConcreteObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("GOT AN UPDATE"); // sout(tick), OBJ.getState
        if (observable instanceof DefaultObservable o){
            System.out.println(o.getState() + "from" + observable);
        }
    }
}
